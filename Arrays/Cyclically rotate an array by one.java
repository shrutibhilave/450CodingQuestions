/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception {
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
		    
		    int temp=arr[n-1];
		    for(int i=n-1;i>0;i--)
		    {
		        arr[i]=arr[i-1];
		    }
		    arr[0]=temp;
		    
		    for(int i=0;i<n;i++)
		    System.out.print(arr[i]+" ");
		    System.out.println();
		}
	}
}