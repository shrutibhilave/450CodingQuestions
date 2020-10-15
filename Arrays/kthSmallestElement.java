
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
public static void main (String[] args)throws Exception {
//code
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t>0)
{
   t--;
   int n=Integer.parseInt(br.readLine());
   int arr[]=new int[n];
   String s[]=br.readLine().split("\\s+");
   int size=Integer.parseInt(br.readLine());
   for(int i=0;i<n;i++)
   arr[i]=Integer.parseInt(s[i]);
   
   PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
   for(int i=0;i<n;i++)
   {
       max.add(arr[i]);
       if(max.size()>size)
       max.poll();
   }
   System.out.println(max.poll());
}
}
}