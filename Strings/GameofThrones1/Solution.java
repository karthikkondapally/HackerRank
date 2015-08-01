package Strings.GameofThrones1;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count[]=new int[27];
		for(int i=0;i<27;i++)
			count[i]=0;
		for(char c :str.toCharArray())
		{
			
			if(count[c-'a']==0)
				count[c-'a']+=1;
			else
				count[c-'a']-=1;
		}
		int sum=0;
		for(int i:count)
			sum+=i;
		
		if(sum>1)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}
