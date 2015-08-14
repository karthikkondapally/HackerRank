package Graphtheroy.SnakeAndLaddersQuickestWayUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class Solution_snakes {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int map[][]= new int[101][101];
	
		while(T-->0)
		{
			for(int i=0;i<=100;i++)
				for(int j=0;j<=100;j++)
				{
					if(j==i+1||j==i+2||j==i+3||j==i+4||j==i+5||j==i+6)
						map[i][j]=1;
					else
						map[i][j]=0;
				}
			
			int N = Integer.parseInt(br.readLine());
			int ladder[][] = new int[101][101];
			for(int i=0;i<=100;i++)
				for(int j=0;j<=100;j++)
					ladder[i][j]=0;
			
			for(int i=0;i<N;i++)
			{
				String str[] = br.readLine().split(" ");
				int u=Integer.parseInt(str[0]);
				int v=Integer.parseInt(str[1]);
				map[u][v]=1;
				ladder[u][v]=1;
			}
			int M = Integer.parseInt(br.readLine());
			for(int i=0;i<M;i++)
			{
				String str[] = br.readLine().split(" ");
				int u=Integer.parseInt(str[0]);
				int v=Integer.parseInt(str[1]);
				for(int j=0;j<=100;j++)
					map[u][j]=0;
				map[u][v]=1;
				ladder[u][v]=1;
			}
		   
			   int s=0;
			for(int q=0;q<=N;q++) 
			   //for(int s=0;s<=N;s++)
					 for(int k=0;k<=100;k++)
					  for(int j=0;j<=100;j++)
						  if(map[s][j]!=0&&map[j][k]!=0)
					   if(map[s][k]>map[s][j]+map[j][k]||map[s][k]==0)
						   {
						   //if(s==0&&k==100)
						   //System.out.println(s+" "+j+ " "+k+" "+map[s][k]+" "+map[s][j]+" "+map[j][k]);
						   
						   if(ladder[j][k]!=1)
						   map[s][k]=map[s][j]+map[j][k];
						   else
							   map[s][k]=map[s][j];
							   
						   }
			
				if(map[0][100]==0)
					System.out.println("-1");
				else
			        System.out.println(map[0][100]);		 
			/*for(int i=0;i<=100;i++){
				System.out.print(i+". ");
				for(int j=0;j<=100;j++){
					System.out.print(j+"."+map[i][j]+"  ");
				}
				System.out.println();
			}*/
			
		 }

	}

}
