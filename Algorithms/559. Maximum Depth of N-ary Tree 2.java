
package word.capitalization;

import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s=in.next();
    String temp="";
    if(Character.isUpperCase(s.charAt(0)))
    {
        System.out.println(s);
    }
    else
    {
       char a = Character.toUpperCase(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            temp+=s.charAt(i);
        }
        
        System.out.println(a+temp);
    }
    }
}

