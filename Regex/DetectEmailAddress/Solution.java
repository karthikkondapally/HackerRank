package Regex.DetectEmailAddress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		TreeSet<String> set = new TreeSet<String>();
		while(N-->0)
		{
		StringTokenizer tokenizer = new StringTokenizer(br.readLine());
		while(tokenizer.hasMoreElements()){
			String str=tokenizer.nextToken();
			StringBuffer sb = new StringBuffer();
			if(str.contains("@")&&str.contains(".")){
				//System.out.println(str);
				int i=str.indexOf("@");
				int j=str.indexOf(".");
				int l=str.length();
				//System.out.println(i+" "+j);
				if(i-j!=1&&i-j!=-1&& i!=0&&j!=0){
					sb.append(str);
					if((sb.charAt(l-1)>=65&&sb.charAt(l-1)<=90)||(sb.charAt(l-1)>=97&&sb.charAt(l-1)<=122)){
						
						if((sb.charAt(0)>=65&&sb.charAt(0)<=90)||(sb.charAt(0)>=97&&sb.charAt(0)<=122))
						set.add(sb.toString());
						else
							{
							sb.deleteCharAt(0);
							set.add(sb.toString());
							}
					}
					else
						{
						
					
						if((sb.charAt(0)>=65&&sb.charAt(0)<=90)||(sb.charAt(0)>=97&&sb.charAt(0)<=122))
						{
							sb.delete(l-1, l-1);
							set.add(sb.toString());	
						}
							else
								{
								sb.deleteCharAt(0);
								sb.delete(l-1, l-1);
								set.add(sb.toString());
								}
						
						
						}
				}
			}
		}
		}
		
for (Iterator iterator = set.iterator(); iterator.hasNext();) {
	String string = (String) iterator.next();
	if(iterator.hasNext())
	System.out.print(string+";");
	else
		System.out.print(string);
}
	}

}
