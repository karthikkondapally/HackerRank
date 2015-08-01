package Greedy.flowers;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] =br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);;
        str = br.readLine().split(" ");
        int arr[]=new int[N];
        int kIndex[]= new int[K];
        int kCost[] = new int[K];
        Arrays.fill(kCost, 0);
        Arrays.fill(kIndex, 0);
        for(int i=0;i<N;i++)
        	arr[i]=Integer.parseInt(str[i]);
         Arrays.sort(arr);
        int j=0;
        int flag=1;
        for(int i=N-1;i>=0;i--){
        	
        if(flag==1)	{
        		kIndex[j]+=1;
        		kCost[j]+=(kIndex[j]*arr[i]);
        		j++;
        		if(j==K)
        			{
        			flag=0;
        			j--;
        			}
        	}
        else{
    		kIndex[j]+=1;
    		kCost[j]+=(kIndex[j]*arr[i]);
        	j--;
        	if(j==-1)
    			{
        		flag=1;
    			j++;
    			}
        }
        	
        }
        
        int sum=0;
        for(int i=0;i<K;i++)
        	sum+=kCost[i];
        System.out.println(sum);
       
    }
}