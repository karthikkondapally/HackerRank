package LonelyInteger;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int x=0;
        for(int i=0;i<N;i++)
            x=sc.nextInt()^x;
        System.out.println(x);
            
    }
}
