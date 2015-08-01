package DirectConnections;
import java.util.Arrays;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		
		while(T-->0){
		int n = Integer.parseInt(sc.next());
		 long x[]= new long [n];
	
		 long population[]= new long[n];
		 for(int i=0;i<n;i++)
			 x[i]=sc.nextLong();
			 
		 for(int i=0;i<n;i++)
			 population[i]=sc.nextLong(); 

		// for(int s : distance)
		// System.out.print(s+" ");
		 long sum =0;
		 for(int i=0;i<n;i++)
			 for(int j=i+1;j<n;j++){
				sum +=((Math.abs((x[j]-x[i]))*Math.max(population[i],population[j]))%1000000007);  
			 }
		 System.out.println(sum%1000000007);
		}
	}

}
