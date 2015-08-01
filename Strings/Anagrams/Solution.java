package Strings.Anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
 BufferedReader bre = new BufferedReader(new InputStreamReader(System.in));
 int T = Integer.parseInt(bre.readLine());
 while (T-->0){
	 String str= bre.readLine();
	 int l=str.length();
	 if(l%2!=0)
		 System.out.println("-1");
	 else{
		 int count[]=new int[27];
		 Arrays.fill(count, 0);
		 for(int i=0;i<l/2;i++){
			 count[str.charAt(i)-'a']+=1;
		 }
		 int count2[]=new int[27];
		 Arrays.fill(count2, 0);
		 for(int i=l/2;i<l;i++){
			 count2[str.charAt(i)-'a']+=1;
		 }
		 int odd=0;
		 for(int i=0;i<26;i++){
			 if(count[i]==count2[i])
				 continue;
			 else
			 {
				 if(count2[i]>0&&count2[i]>count[i])
					
					 odd+=count2[i]-count[i];
				 
			 }
				 
		 }
		 		 System.out.println(odd);
	 }
 }
	}

}
