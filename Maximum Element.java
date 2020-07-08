

import java.util.Scanner;
import java.util.Stack;


public class MaximumElement {
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Stack<Integer> s = new Stack<Integer>();

    int n=in.nextInt();
    for(int i=0;i<n;i++)
    {
        int q=in.nextInt();
        if(q==1)
        {int number=in.nextInt();
            if(s.empty()==true)
            {
                s.push(number);
            }
            else
            {
                int top = s.peek();
                if(top>=number)
                {
                    s.push(top);
                }
                else
                {
                    s.push(number);
                }
            }
        }
        else if(q==2)
        {
            s.pop();
        }
        else
        {
            System.out.println(s.peek());
        }
    }
    }
}
