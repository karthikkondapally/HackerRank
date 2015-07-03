

import java.io.*;
import java.util.*;

public class Solution {
static  int arr[][] = new int[10][100000];
static  int l[]=new int[10];
static  long pre[] = new long[100000]; 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
int out[]=new int[10];
int T = sc.nextInt();
        for(int i =0;i<T;i++)
            {
            l[i]=sc.nextInt();
            for(int j = 0;j<l[i];j++)
            {
                
             arr[i][j]=sc.nextInt();
                if(j==0)
                    pre[j]=arr[i][j];
                else
                    pre[j]=pre[j-1]+arr[i][j];
            }
            if(l[i]!=1)   
            for(int j = 1;j<l[i]-1;j++)
            {
                if(pre[j-1] == pre[l[i]-1]-pre[j])
                {out[i]=1; break;}
                    else
                    	out[i]=0;
                }
            else
            	out[i]=1;
            
        }
        
        for(int i=0;i<T;i++)
        	if(out[i]==1)
        		System.out.println("YES");
        	else 
        		System.out.println("NO");
    }
    
}
