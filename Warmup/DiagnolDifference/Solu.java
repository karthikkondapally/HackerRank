package Warmup.DiagnolDifference;

import java.math.BigInteger;
import java.util.Scanner;

public class Solu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc =new Scanner(System.in);

		long n = Long.parseLong(sc.next());
	     BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
		System.out.println(fact.toString());
	}

}
