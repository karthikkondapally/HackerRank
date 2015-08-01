package CutTheSticks;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int min=100000,k=0,l=0,sum=0;
        for(int i=0;i<n;i++)
            if(a[i]<min){
            min=a[i];
            k=i;
        }
        while(true){
            
            for(int i=0;i<n;i++)
                {
                

                    if(a[i]==0)   
                    { l++;continue;}
              
                    a[i]=a[i]-min;
                    sum++;
                
           
            }
               if(l==n)
                break;
            System.out.println(sum);
            
            sum=0;
           
            
         
             min=100000;
              for(int i=0;i<n;i++)
            if(a[i]<min && a[i]!=0){
            min=a[i];
            k=i;
        }l=0;
            
        }
        
    }
}