package Regex.AndProduct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T = Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			String str[]= br.readLine().split(" ");
		long A=Integer.parseInt(str[0]);
		long B=Integer.parseInt(str[1]);
		long p = (long) Math.log(A);
		long q = (long) Math.log(B);	
	  if(p<=q)
        System.out.println(A);
	  else
		System.out.println(B);
		}
  long t =67108874;
  for(long i=67108875;i<=68157441;i++)
    t=t&i;
  System.out.println(t);
	}

}
