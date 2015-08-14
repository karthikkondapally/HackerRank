package Graphtheory.Prims.Mst;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Solution{

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int T = 1;
		    while(T-->0){
		    	String str[] = br.readLine().split(" ");
		    	int N=Integer.parseInt(str[0]);
		    	int M=Integer.parseInt(str[1]);
		    	int graph[][]= new int[N+1][N+1];
                int visited[]=new int[N+1];
                int total=0;
                Arrays.fill(visited, -1);
		   // 	TreeMap <Integer,int[]> map = new TreeMap<Integer, int[]>(); 

		    	for(int i=0;i<M;i++)
		    	{
		    		str = br.readLine().split(" ");		
		    		int p=Integer.parseInt(str[0]);
		    		int q=Integer.parseInt(str[1]);
		    		int w= Integer.parseInt(str[2]);
		      		graph[p][q]=graph[q][p]=w;
		    		
		    	}
		    	int s = Integer.parseInt(br.readLine());
                int u = s;
                int v=0;
                visited[s]=1;
		    	for(int i=1;i<=N;i++){
		    		int min=999999999;
		    		
		    		
		    		for(int j=1;j<=N;j++){
		    			if(graph[u][j]<min&&visited[j]!=1){
		    				min=graph[u][j];
		    				v=j;
		    			}
		    		}
		    		
		    		visited[v]=1;
		    		u=v;
		    	}
			
			
		    }

	}
	
	
}


