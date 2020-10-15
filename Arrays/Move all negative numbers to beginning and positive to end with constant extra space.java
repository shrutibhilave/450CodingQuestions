/*package whatever //do not write package name here */

import java.io.*;
 
class GFG {
 
    static void rearrange(int arr[], int n)
    {
        int first=0;
        int last=n-1;
        int mid=0;
        while(mid<last)
        {
            if(arr[mid]<0)
            {
                first++;
                mid++;
            }
            else{
                int t=arr[mid];
                arr[mid]=arr[last];
                arr[last]=t;
                last--;
            }
            
        }
    }
 
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    public static void main(String args[])
    {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
 
        rearrange(arr, n);
        printArray(arr, n);
    }
}