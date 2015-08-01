package Strings.AntiPalindromicStrings;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		while( T-->0){
			
			int stringLength =sc.nextInt();
			int nochar = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			int k=0;
			int sum=0;
		//System.out.println(Math.pow(nochar, stringLength));
		      for(int i=0;i<Math.pow(nochar, stringLength);)
		      {  
		    	   sb.setLength(0);
				   sb.append((char)(k+65));
				   for(int p=0;p<nochar;p++)
		    	  for(int j=0;j<stringLength;j++){
				   sb.append((char)(p+j+65));
			     }
		    	  
				   System.out.println(sb.toString());
				   if(!sb.toString().equals(sb.reverse().toString()))
					   sum++;
				   i++;
		    	  k++;
		      }
		      
		      System.out.println(sum);
		}
		

	}

}
