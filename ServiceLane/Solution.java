package ServiceLane;

import java.io.*;
import java.util.*;

public class Solution {
   static int a[];
    static int entry[];
    static int exit[];
    static int out[];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        a = new int[N];
        int T = sc.nextInt();
         entry = new int[T];
        exit = new int[T];
        out = new int[T];
        for (int i=0;i<N;i++)
            a[i]=sc.nextInt();
        for (int i=0;i<T;i++)
            {entry[i]=sc.nextInt(); exit[i]=sc.nextInt();}
        int min;
        for(int i=0;i<T;i++){
         min=100000;
            for(int j=entry[i];j<=exit[i];j++)
            {
            if(a[j]<min)
                min=a[j];
        }
            out[i]=min;
        }
        
        for(int i=0;i<T;i++)
            System.out.println(out[i]);
        
         
        
    }
}
