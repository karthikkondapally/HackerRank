package Strings.FunnyString;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		int flag=0;
		while(T-->0){
String s = sc.nextLine();
flag=0;
for(int i=1,j=s.length()-1;i<s.length()&&j>0;i++,j--){
	if( Math.abs(s.charAt(i)-s.charAt(i-1))==Math.abs(s.charAt(j)-s.charAt(j-1)))
		continue;
	else 
	{
		flag=1;
		break;
	}	
}

if(flag!=1)
	System.out.println("Funny");
else 
	System.out.println("Not Funny");
			
		}

	}

}
