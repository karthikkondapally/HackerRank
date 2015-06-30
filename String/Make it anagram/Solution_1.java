//package application;

import java.io.*;
import java.util.*;

public class Solution_1 {
  static int count1[];
 // static   int count2[];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str1= sc.next();
        String str2= sc.next();
        count1 = new int[256];
       // count2 = new int[256];
        for(int i=0;i<=25;i++)
            count1[i]=0;
        
   //     for(int i=0;i<255;i++)
   //         count2[i]=0;
        int temp=0;
        for(int i=0;i<str1.length();i++)
           count1[(int)str1.charAt(i)-(int)'a']+=1;
          for(int i=0;i<str2.length();i++)
            count1[(int)str2.charAt(i)-(int)'a']-=1;
    
          for(int i=0;i<=25;i++)
         temp=temp+(count1[i]>0?count1[i]:-count1[i]);

    System.out.println(temp);
    }
}