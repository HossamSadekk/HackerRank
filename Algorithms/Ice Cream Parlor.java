
package ice.cream.parlor;

import java.util.Scanner;

public class IceCreamParlor {
    
    public static  void search(int [] arr,int sum)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
              if(arr[i]+arr[j]==sum && i!=j)
              {
                  System.out.println((i+1)+" "+(j+1));return;
              }
            } 
        }
    }

    public static void main(String[] args) {

    Scanner in = new Scanner (System.in);
    int tests = in.nextInt();
    
    for (int i = 0; i < tests; i++) 
    {
        int sum = in.nextInt();
        int test = in.nextInt();

        int [] arr = new int [test];
        for (int j = 0; j < arr.length; j++) {

            arr[j]=in.nextInt();
        }
        search(arr,sum);
    }
    
    }
}