import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
static int findMaxSum(int a[], int n) {
 int ans=Integer.MIN_VALUE;
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		    	sum=sum+a[i];
		    	if(sum<a[i])
		    		sum=a[i];
		    	if(ans<sum)
		    			ans=sum;
		    }
		    return(ans);
}


public static void main (String[] args) throws IOException
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    while(t-- > 0)
    {
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];

        String line = br.readLine();
        int i = 0;
        for (String numStr: line.split("\\s"))
        {
            a[i] = Integer.parseInt(numStr);
            i++;
        }

        int ans = findMaxSum(a,n);
        System.out.println(ans);
    }
    }
}