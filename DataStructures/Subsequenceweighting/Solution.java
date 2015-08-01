package DataStructures.Subsequenceweighting;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		while(T-->0){
			int N = Integer.parseInt(sc.next());
		long key[]= new long[N];
		long value[]=new long[N];
			for(int i=0;i<N;i++)
		      key[i]=Integer.parseInt(sc.next());
			for(int i=0;i<N;i++)
			  value[i]=Integer.parseInt(sc.next());
		long currentsum=value[0];
		long bestsum=0;
		
        HashMap<Long, HashMap<Integer,Long>> map =new HashMap<Long,HashMap<Integer,Long>>(); 
		
	    for(int i=0;i<N;i++)
	    {
	    	HashMap<Integer,Long> hash = new HashMap<Integer, Long>();
	          hash.put(i, value[i]);
	          if(!map.containsKey(key[i]))
	          map.put(key[i], hash);
	          else
	        	  {
	        	  hash=map.get(key[i]);
	        	  hash.put(i, value[i]);
	        	  map.put(key[i],hash);
	    }
	    }
		 for(long s:map.keySet())
			 System.out.println(s+" "+map.get(s));
		
		}
		
		
	}

}
