package DynamicProgramming.Fibonaccimodified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[]=br.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int N = Integer.parseInt(str[2]);
		BigInteger big1 = BigInteger.valueOf(A);
        BigInteger big2 = BigInteger.valueOf(B);
        BigInteger big3 = BigInteger.valueOf(1);
        		
        for(int i=0;i<N-2;i++){
        	
        	big3=big2;
        	big2 = (big2.multiply(big2)).add(big1);
        	big1=big3;
        
        }
        System.out.println(big2);
	}

}
