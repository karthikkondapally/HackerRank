package Graphtheory.Prims.Mst;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Solution_kruskal_wrong {

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
                Arrays.fill(visited, -1);
		    	TreeMap <Integer,int[]> map = new TreeMap<Integer, int[]>(); 

		    	for(int i=0;i<M;i++)
		    	{
		    		str = br.readLine().split(" ");		
		    		int p=Integer.parseInt(str[0]);
		    		int q=Integer.parseInt(str[1]);
		    		int w= Integer.parseInt(str[2]);
		    
		    		int arr []= new int[2];
		    		arr[0]=p;
		    		arr[1]=q;
		    		map.put(w, arr);
		    	}
		    	int s = Integer.parseInt(br.readLine());
               // visited[s]=1;
		    	int total=0; 
                Set set = map.keySet();
                Iterator iterator = set.iterator();
                while(iterator.hasNext()){
                	int w= (int)iterator.next();
                	int [] arr = map.get(w);
                	if(visited[arr[0]]!=1||visited[arr[1]]!=1)
                	{
                		visited[arr[0]]=1;
                		visited[arr[1]]=1;
                		total+=w;
                	}
                }
                
                System.out.println(total);
				
			}
			
			
		    }

	}


