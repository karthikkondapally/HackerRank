package Warmup.CavityMap;
import java.util.Scanner;
public class Solution {
 public static void main(String[] args){
	 
 
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	String arr[] = new String [n];
	for(int i=0;i<n;i++)
		arr[i]=sc.next();
	char newarr[][]= new char[n][n];

     for(int i=0;i<n;i++)
    	 newarr[i]=arr[i].toCharArray();
     for(int i=0;i<n;i++){
    	 for(int j=1;j<n-1;j++)
    	 {
    		 
    		 if((newarr[i][j]>newarr[i][j-1])&&(newarr[i][j]>newarr[i][j+1]))
    			 {
    			 if(i==0)
    				 if((newarr[i][j]>newarr[i+1][j]))
    			       newarr[i][j]='X';
    	         if(i==n-1)
    	        	 if((newarr[i][j]>newarr[i-1][j]))
    	        		 newarr[i][j]='X';
    	         if(i>0&&i<n-1)
    	        	 if((newarr[i][j]>newarr[i-1][j])&&(newarr[i][j]>newarr[i+1][j]))
    	        		 newarr[i][j]='X';

    			 }
    	 }
     
     }
     for(int i=0;i<n;i++){
    	 for(int j=0;j<n;j++)
    		 System.out.print(newarr[i][j]);
    	 System.out.println("");
     }
   }
}