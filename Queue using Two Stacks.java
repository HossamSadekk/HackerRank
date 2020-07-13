package queue.using.two.stacks;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Queue<Integer> qu = new LinkedList<>();
    for(int i=0;i<n;i++)
    {
        int q=in.nextInt();
        
        if(q==1)
        {
            int num = in.nextInt();
            qu.add(num);
            
        }
        else if(q==2)
        {
            qu.poll();
        }
        else
        {
            System.out.println(qu.peek());
        }
       
    }
    }
}