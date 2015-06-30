//package Warmup.TheLoveLettermystery;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		while(T-->0){
			String str = sc.nextLine();
			int l=str.length();
			int operation=0;
			for(int i=0,j=l-1;i<j;i++,j--)
			{
				if(str.charAt(i)==str.charAt(j))
					continue;
				else{
					int p=str.charAt(i);
					int q=str.charAt(j);
					operation+=Math.abs(p-q);
					
				}
				
			}
			System.out.println(operation);
			
		}
		
	}

}
