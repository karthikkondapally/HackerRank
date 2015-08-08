package Greedy.CuttingBoards;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		long totalcost = 0;
		while(T-->0)
		{
			int M = Integer.parseInt(sc.next());
			int N =Integer.parseInt(sc.next());
			Long y[]= new Long[M-1];
			Long x[]= new Long[N-1];
			for(int i=0;i<M-1;i++)
			 y[i]=Long.parseLong(sc.next());
			for(int i=0;i<N-1;i++)
			 x[i]=Long.parseLong(sc.next());
			Arrays.sort(y, Collections.reverseOrder());
			Arrays.sort(x,Collections.reverseOrder());
			/*for(long r:y)
				System.out.print(r+" ");
			System.out.println("");
			for(long w:x)
				System.out.print(w+" ");
			System.out.println("");
			*/int j=0,k=0,kx=1,ky=1;
			
		totalcost=0;
			for(int i=1;i<=M+N-2;i++)
			{
				if(k<M-1&&j<N-1)
				{	
				if(x[j]>y[k])
				{
					
					totalcost=(totalcost+(ky*x[j])%1000000007)%1000000007;
					j++;
					kx=kx+1;
				}
				else if(x[j]<y[k])
				{
				    totalcost=(totalcost+(kx*y[k])%1000000007)%1000000007;
					k++;
					ky=ky+1;
				}
				else if(x[j]==y[k]){
					if(ky<kx){
						totalcost=(totalcost+(ky*x[j])%1000000007)%1000000007;
						j++;
						kx=kx+1;
					}
					else {
						 totalcost=(totalcost+(kx*y[k])%1000000007)%1000000007;
							k++;
							ky=ky+1;
					}
				}
				
			    }
				else{
					if(k==M-1){
						for(int q=j;q<N-1;q++){
							totalcost=(totalcost+(ky*x[j])%1000000007)%1000000007;
							i++;
						}
					}
					
					if(j==N-1){
						for(int q=k;q<M-1;q++){
							totalcost=(totalcost+(kx*y[k])%1000000007)%1000000007;
							i++;
						}
					}
				}
		
			}
			System.out.println(totalcost);

		}

	}

}
