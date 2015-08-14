package Strings.BiggerisGreater;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


	public class Solution 
	{
	   
	    public static void main(String[] args) throws NumberFormatException, IOException {
	    	
	    	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	int T = Integer.parseInt(br.readLine());
	    	while(T-->0)
	    	{
	    		StringBuffer sb = new StringBuffer();
	    	String str=br.readLine();
            char[] a = str.toCharArray();
            Arrays.sort(a);
            int j=str.length()-1;
	    		 for(int i=0;i<str.length();i++){
	    			 if(i==0&&str.charAt(i)>a[j])
	    				 {
	    				 sb.append(String.valueOf(a)).reverse();
	    				 break;
	    				 }
	    		
	    		 }
	    		 
	    		 System.out.println(sb.toString());
	    }
	    }
	}