package Warmup.DiagnolDifference;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		int arr[][]=new int [N][N];
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				arr[i][j]= Integer.parseInt(sc.next());
	 int sum=0,temp=0;
		for(int i=0;i<N;i++)
			temp=temp+arr[i][i];
		sum+=temp;
		temp=0;
		for(int i=0,j=N-1;i<N;i++,j--)
			temp=temp+arr[i][j];
		sum=sum-temp;
		System.out.println(Math.abs(sum));

	}

}
