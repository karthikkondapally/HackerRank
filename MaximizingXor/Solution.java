package MaximizingXor;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner (System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int sum=-111111;
        int a=0;
        for(int i=l;i<=r;i++)
            {
            for(int j=l;j<=r;j++)
                {
                a=i^j;
                 if(a>sum)
                sum=a;

            }


           
        }
        
        System.out.print(sum);
    }
}

