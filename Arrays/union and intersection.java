import java.util.*;
import java.lang.*;
import java.io.*;

class gfg {
    static void findunion()
    {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
             int m=s.nextInt();
             HashSet hs=new HashSet();
             
             for(int i=0;i<n+m;i++)
             {
                 int d=s.nextInt();
                 if(!hs.contains(d))
                 hs.add(d);
             }
             System.out.println("union: "+hs.size());
    }
    
    static void intersection()
    {
        int count=0;
         Scanner s=new Scanner(System.in);
            int n=s.nextInt();
             int m=s.nextInt();
             HashSet hs2=new HashSet();
             
             for(int i=0;i<n+m;i++)
             {
                 int d=s.nextInt();
                 if(hs2.contains(d))
                 count++;
                 else
                 hs2.add(d);
                 
             }
             System.out.println("intersection: "+count);
    }
	public static void main (String[] args) {
        	
        	findunion();
        	intersection();
                
	}
}