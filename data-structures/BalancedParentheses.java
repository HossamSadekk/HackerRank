
package balanced.parentheses.pkg6;

import java.util.Scanner;
import java.util.Stack;


public class BalancedParentheses6 {
   static boolean check(char open ,char close)
    {
        if(open =='(' && close ==')')
        {
            return true;
        }
        else if(open =='{' && close =='}')
        {
            return true;
        }
        else if(open =='[' && close ==']')
        {
            return true;
        }
        else
        return false;
            
        
    }
    
    
    
    static boolean Balance (String exp)
    {
        Stack<Character> s = new Stack<Character>();
        for(int i=0;i<exp.length();i++)
        {
            if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='[' )
            {
                s.push(exp.charAt(i));
            }
            else if(exp.charAt(i)==')' || exp.charAt(i)=='}' || exp.charAt(i)==']' )
            {
                if(s.empty() || !check(s.peek(),exp.charAt(i)))
                {
                    return false;
                }
                else
                {
                    s.pop();
                }
            }
        }
        return s.empty();
    }

    
    public static void main(String[] args) {

    Scanner in = new Scanner (System.in);
    String ex = in.next();
        System.out.println((Balance(ex)==true)?"Balanced":"Not Balanced");
    
    }
    
}