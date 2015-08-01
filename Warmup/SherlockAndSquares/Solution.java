package Warmup.SherlockAndSquares;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		while(T-->0){
	    int start = sc.nextInt();
        int end = sc.nextInt();	
        int sum=0;
        for(double i=start;i<=end;i++){
        	if(square(i))
        		sum++;
        }
        System.out.println(sum);
		}
		
	}

	private static boolean square(double i) {
		// TODO Auto-generated method stub
		if(Math.sqrt(i)-Math.floor(Math.sqrt(i))==0.0)
			return true;
		return false;
	}

}
