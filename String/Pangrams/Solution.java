import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int count[] = new int[257];
        for(int i=0;i<257;i++)
            count[i]=0;
        
              test=test.toLowerCase();

        for(int i=0;i<test.length();i++)
        	{ 
            
            if(test.charAt(i)==' ')
            continue;
                else 
        		count[(int)test.charAt(i)] =1;
             }
        int Sum =0;
        for(int i=0;i<257;i++)
            Sum=count[i]+Sum;
        
        if(Sum>=26)
        	System.out.println("pangram");
        else 

        	System.out.println("not pangram");
    }
}