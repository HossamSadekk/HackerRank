package equal.stacks;

import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {
    
    public static void MaximumHeight(int [] a,int [] b,int [] c)
    {
       int height1=0,height2=0,height3=0;
       
    Stack<Integer> x = new Stack<Integer>();
    Stack<Integer> y = new Stack<Integer>();
    Stack<Integer> z = new Stack<Integer>();
    
    for(int i=a.length-1;i>=0;i--)
    {
        height1+=a[i];
        x.push(height1);
    }
    for(int i=b.length-1;i>=0;i--)
    {
        height2+=b[i];
        y.push(height2);
    } 
    for(int i=c.length-1;i>=0;i--)
    {
        height3+=c[i];
        z.push(height3);
    }
    while(true){
        if(x.isEmpty() || y.isEmpty() || z.isEmpty())
    { 
        System.out.println("0");
        return;
    }
        
    height1=x.peek();    
    height2=y.peek();
    height3=z.peek();
    

    if(height1==height2 && height2==height3)
    {
        System.out.println(height1);
        return;
    }
    
    if(height1>=height2 && height1>=height3)
    {
        x.pop();
    }
    else if(height2>=height3 && height2>=height1)
    {
        y.pop();
    }
    else if(height3>=height2 && height3>=height1)
    {
        z.pop();
    }
    
        
        
    }
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int na = in.nextInt();
    int nb = in.nextInt();
    int nc = in.nextInt();

    int [] a = new int [na];
    for(int i=0;i<na;i++)
    {
        a[i]=in.nextInt();
    }
    
    int [] b = new int [nb];
    for(int i=0;i<nb;i++)
    {
        b[i]=in.nextInt();
    }
    
    int [] c = new int [nc];
    for(int i=0;i<nc;i++)
    {
        c[i]=in.nextInt();
    }
    
    MaximumHeight(a ,b ,c);
    
    
   
    
    
    }
    
}
