package Greedy.TwoArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new  Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		while(T-->0){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int [] A = new int[n];
			int [] B = new int[n];
			for(int i=0;i<n;i++)
				A[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				B[i]=sc.nextInt();
			int flag=0;
			Arrays.sort(A);
			Arrays.sort(B);
			for(int i=0,j=n-1;i<n&&j>-1;i++,j--)
				if(A[i]+B[j]<k)
				{
					flag=1;
					break;
				}
			if(flag==1)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

	}

}
