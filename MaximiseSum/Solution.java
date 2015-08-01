package MaximiseSum;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long T = sc.nextInt();
        long currentSum=0;
        long bestSum=0;
        
        while(T-->0)
        {
            long N = sc.nextLong();
            long arr[] = new long [ (int) N];
            long M = sc.nextLong();
            currentSum=0;
            bestSum=-1;
            for (int i = 0; i < N; i++) 
				arr[i]=sc.nextLong();
            currentSum=arr[0];
            for(int i=1;i<N;i++)
            {     
            	
            	System.out.println(currentSum+" "+arr[i]+" "+(currentSum+arr[i])%M);

            	currentSum=(currentSum+arr[i])%M>arr[i]%M?(currentSum+arr[i]):arr[i];
            	bestSum = bestSum>(currentSum%M)?bestSum:currentSum%M;
            }
            
            System.out.println(bestSum);
			
        }
    }
}