package AngryProfessor;

import java.io.*;
import java.util.*;

public class Solution {
static int arr[][] =new  int [10][1000];
    static int k[];
    static int n[];
    static String out[];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
         k = new int[T];
         n =new  int[T];
         out=new  String[T];
        for(int i=0;i<T;i++)
        {
         n[i] = sc.nextInt();
         k[i]=sc.nextInt();   
            for(int j=0;j<n[i];j++)
                arr[i][j]=sc.nextInt();
        }
        
        int temp=0;
          for(int i=0;i<T;i++)
        {     out[i]="YES";
              temp=0;
              for(int j=0;j<n[i];j++)
               { if(arr[i][j]<=0)
                  temp++;
              if(temp>=k[i])
              {out[i]="NO";break;}
               }  
                  
                  
        }
        
        
        for(String s:out)
            System.out.println(s);
        
        
    }
}