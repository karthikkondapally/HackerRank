package SumofAbsolutes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	static int N,Q,arr[],L,R;
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] st = br.readLine().split(" ");
		N= Integer.parseInt(st[0]);
		arr = new int[N+1];
		Q= Integer.parseInt(st[1]);
		String [] str =br.readLine().split(" ");
		for(int i=0;i<N;i++)
			arr[i+1]=Integer.parseInt(str[i]);
		
		while(Q-->0){
			st = br.readLine().split(" ");
			 L= Integer.parseInt(st[0]);
			 R = Integer.parseInt(st[1]);
			 Find(L, R);
			
		}
			
	}
	
	
	public static void  Find(int L,int R)
	{
	    int sum = 0;
	    for (int  i = L ; i<= R; i=i+1 )
	    {
	        sum = Math.abs(sum + arr[i]);
	    }
	   if(sum%2==0)
		   System.out.println("Even");
	   else
		   System.out.println("Odd");
	}

}
