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
 
String s=br.readLine();
       StringBuilder str = new StringBuilder();
       str.append(s);
 
 
       System.out.println(str.reverse());
}
}
}