package HalloweenParty;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
          int T = sc.nextInt();
        long arr[] = new long[T];
         for(int i=0;i<T;i++)
             arr[i]=sc.nextLong();
        
        
        for(int i=0;i<T;i++){
            
        if(arr[i]%2==0)    
            System.out.println((arr[i]/2)*(arr[i]/2));
        else
            System.out.println(((arr[i]/2)*(arr[i]/2))+(arr[i]/2) );
        }
        
        
        
    }
}
