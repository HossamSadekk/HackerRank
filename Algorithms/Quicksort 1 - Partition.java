import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
static int partition(int [] arr,int l , int r)
{
    int i=l;
    int j=r;
    int PivLoc = i;
    int mid = (l+r)/2;
    
    while(true)
    {
        while(arr[PivLoc]<=arr[j]&&j!=PivLoc)
        {
            j--;
        }
        if(PivLoc==j)
        {
            break;
        }
        else
        {
            int temp = arr[PivLoc];
            arr[PivLoc]=arr[j];
            arr[j]=temp;
            PivLoc=j;
        }
        while(arr[PivLoc]>=arr[i]&&i!=PivLoc)
        {
            i++;
        }
        if(PivLoc==i)
        {
            break;
        }
        else
        {
            int temp = arr[PivLoc];
            arr[PivLoc]=arr[i];
            arr[i]=temp;
            PivLoc=i;
        }
    }
    return PivLoc;
}
    static void quickSort(int[] arr,int l,int r) {
  if(l<r)
    {
        int p = partition(arr,l ,r);
        quickSort(arr,l,p-1);
        quickSort(arr,p+1,r);
    }
      
    }
static void printarrayay(int array[])
    {
    int n = array.length;
    for (int i=0; i<n; ++i)
    System.out.print(array[i]+" ");
    System.out.println("");
    }
    public static void main(String[] args)   {
        Scanner in =  new Scanner (System.in);
        int b = in.nextInt();
        int [] arr = new int[b];
        for(int i=0;i<b;i++)
        {
           arr[i]=in.nextInt(); 
        }    
        quickSort(arr,0,arr.length-1);
        printarrayay(arr);
    } 
}
