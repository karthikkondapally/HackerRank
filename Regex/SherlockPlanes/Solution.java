package Regex.SherlockPlanes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.parseInt(br.readLine());
        while(T-->0){
        	String str1=br.readLine();
        	String str2=br.readLine();
        	String str3=br.readLine();
        	String str4=br.readLine();
        	String[] a=str1.split(" ");
        	String[] b=str2.split(" ");
        	String[] c=str3.split(" ");		
        	String[] d=str4.split(" ");
        	int x1=Integer.parseInt(a[0]);
        	int y1=Integer.parseInt(a[1]);
        	int z1=Integer.parseInt(a[2]);
        	int x2=Integer.parseInt(b[0]);
        	int y2=Integer.parseInt(b[1]);
        	int z2=Integer.parseInt(b[2]);
        	int x3=Integer.parseInt(c[0]);
        	int y3=Integer.parseInt(c[1]);
        	int z3=Integer.parseInt(c[2]);
        	int x4=Integer.parseInt(d[0]);
        	int y4=Integer.parseInt(d[1]);
        	int z4=Integer.parseInt(d[2]);
        	x2=x2-x1;
        	y2=y2-y1;
        	z2=z2-z1;
        	
        	x4=x4-x1;
        	y4=y4-y1;
        	z4=z4-z1;
        	
        	x3=x3-x1;
        	y3=y3-y1;
        	z3=z3-z1;
        	
        	int p=y2*z4-z2*y4;
        	int q=z2*x4-x2*z4;
        	int r=x2*y4-y2*x4;
        	if(p*x3+q*y3+r*z3==0)
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        }
    }
}