package Graphtheory.DijkstraShortestReach;

//package Graphtheory.BFSShortestReach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int T = Integer.parseInt(br.readLine());
		    while(T-->0){
		    	String str[] = br.readLine().split(" ");
		    	int N=Integer.parseInt(str[0]);
		    	int M=Integer.parseInt(str[1]);
		    	int graph[][]= new int[N+1][N+1];
              for(int i=0;i<=N;i++)
              	for(int j=0;j<=N;j++)
              		if(i==j)
              			graph[i][j]=0;
              		else
              		graph[i][j]=-1;
		    	for(int i=0;i<M;i++)
		    	{
		    		str = br.readLine().split(" ");
		    		int p=Integer.parseInt(str[0]);
		    		int q=Integer.parseInt(str[1]);
		    		graph[p][q]=graph[q][p]=Integer.parseInt(str[2]);
		    		
		    	}
		    	int s = Integer.parseInt(br.readLine());

             
		   for(int j=1;j<=N;j++)
			   if(j!=s)
			   System.out.print(graph[s][j]+" ");
		   System.out.println("");
		    }

	}

}
