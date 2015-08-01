package Search.pairs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    	Scanner sc = new Scanner(System.in);
        
        long Sum=0;
        int n= sc.nextInt();
        long arr[]= new long [n];
        long k= sc.nextInt();
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        double timeA = System.currentTimeMillis();
      ///  Arrays.sort(arr);
        int j=n-1;
        int l=j;
        
       HashMap<Long,Integer> map=new HashMap<Long, Integer>();
        for (int i = 0; i < n; i++) {
        	map.put(arr[i], map.containsKey(arr[i])?map.get(arr[i])+1:1);
			
		}
       
      //  for(Long q:map.keySet())
       // 	if(map.get(q)>1)
      //  System.out.println(q+" "+ map.get(q));
       // System.out.println(map.size());
        
        for(int i=0;i<n;i++)
        {
        if(map.containsKey(arr[i]-k))
        	Sum++;
       
        }
        System.out.print(Sum);
        double timeB=System.currentTimeMillis();
        System.out.println("time is +"+(timeB-timeA)/1000);
    }
}