package Graphtheroy.SnakeAndLaddersQuickestWayUp;
/*  Solution without snakes*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0){
			TreeMap<Integer, Integer> laddermap = new TreeMap<>();
			TreeMap<Integer, Integer> snakes = new TreeMap<>();
			
			int N = Integer.parseInt(br.readLine());
			
			for(int i=0;i<N;i++)
			{
				String str[] = br.readLine().split(" ");
				laddermap.put(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
			}
			int M = Integer.parseInt(br.readLine());
			for(int i=0;i<M;i++)
			{
				String str[] = br.readLine().split(" ");
				snakes.put(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
			}
			
			
		int start[] = new int[N];
		int end[]   = new int[N];
		int snakestart[] = new int[M];
		int snakeend[]   = new  int[M];
		Set set = laddermap.entrySet();
		Iterator iterator = set.iterator();
		int j=0;
		while(iterator.hasNext()){
	         
			Map.Entry me = (Map.Entry)iterator.next();
	        start[j]=(int)me.getKey();
            end[j]=(int)me.getValue();
            j++;
            
		}
		
		
		 set = snakes.entrySet();
		 iterator = set.iterator();
		j=0;
		while(iterator.hasNext()){
	         
			Map.Entry me = (Map.Entry)iterator.next();
	        snakestart[j]=(int)me.getKey();
            snakeend[j]=(int)me.getValue();
            j++;
            
		}
		
		int sta=start[0];
		int en =end[0];
		int steps=0;
		for(int i=1;i<N;i++){
			if(start[i]<en){
				if(end[i]-start[i]>en-sta)
				{
				   sta=start[i];
				   en=end[i];
				   steps=0;
				}
				
			}
			else if(start[i]>en){
				en=end[i];
				steps+=(end[i]-start[i])/6+((end[i]-start[i])%6!=0?1:0);
			}
		}
		
		System.out.println(sta+" "+en+" "+steps);
		
		steps+=(sta/6)+(sta%6!=0?1:0)+(100-en)/6+((100-en)%6!=0?1:0);	
		System.out.println(steps);
		}
		
	}

}
