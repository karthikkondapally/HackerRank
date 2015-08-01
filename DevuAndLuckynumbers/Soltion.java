package DevuAndLuckynumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soltion {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] st = br.readLine().split(" ");
		int x= Integer.parseInt(st[0]);
		int y= Integer.parseInt(st[1]);
		int z= Integer.parseInt(st[2]);
		long sum= x*4+y*5+z*6;
		long num= x+y+z;
		long mod = num<=3?0:num%3;
		long sol=sum;
		long temp;
		long k=2*sum;
		for(int i=2;i<=num;i++ ){
		    temp=(long)((2+mod)*(sum*Math.pow(10, i-1)) +k)  %1000000007;
		    k=temp;
			sol=(long) (sol+temp)%1000000007;
		}
		
		System.out.println(sol);
	}

}
