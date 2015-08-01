package Combinatorics.DiwaliLights;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T =Integer.parseInt(sc.next());
        while(T-->0){
            int n=Integer.parseInt(sc.next());
            long x=(long)Math.pow(2,n)%100000-1;
            System.out.println(x);
            
        }
        
    }
}