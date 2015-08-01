package Strings.BiggerisGreater;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


	public class Solution 
	{
	   
	    public static void main(String[] args) throws NumberFormatException, IOException {
	    	
	    	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	int T = Integer.parseInt(br.readLine());
	    	while(T-->0){
	    		String str=br.readLine();
	       StringBuffer sb = new StringBuffer();
	       int length= sb.length();
           int i;
	       for( i=0;i<length-1;i++)
	       { if(str.charAt(i) == str.charAt(i+1))
	    		   continue;
	       else 
	    	   break;
	       }
	       if(i==length-2)
	    	   System.out.println();

	    }
	    }
	}