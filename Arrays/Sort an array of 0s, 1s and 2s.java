/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws Exception {
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0)
		{
		    t--;
		    int n=Integer.parseInt(br.readLine());
		    String[] str=br.readLine().split("\\s+");
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=Integer.parseInt(str[i]);
		   // Arrays.sort(arr);
		   int high=n-1;
		   int low=0;
		   int mid=0;
		   while(mid<high)
		   {
		       if(arr[mid]==0)
		       {
		          int a=arr[mid];
		          arr[mid]=arr[low];
		          arr[low]=a;
		          mid++;
		          low++;
		       }
		       if(arr[mid]==2)
		       {
		           int a=arr[high];
		           arr[high]=arr[mid];
		           arr[mid]=a;
		           high--;
		       }
		       if(arr[mid]==1)
		       mid++;
		   }
		   
		    for(int i=0;i<n;i++)
		    System.out.print(arr[i]+" ");
		    System.out.println();
		}
	}
}