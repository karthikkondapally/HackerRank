package Search.SimilarPairs;

import java.io.*;
import java.util.*;

public class Solution {
 static int n,tp,t, arr[],y[],Sum=0,temp=0,pa[];
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      double start = System.currentTimeMillis();
    	Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr=new int[n+1];
         t= sc.nextInt();
        int parent,child;
        

        for(int i=1;i<n;i++)
            {
            parent=sc.nextInt();
            child=sc.nextInt();
            arr[child]=parent;   
            }
        
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for(int i=1;i<=n;i++)
        {
        	if(arr[i]==0)
        		continue;
        	ArrayList<Integer> list= new ArrayList<Integer>();
        	list.add(i);
        	if(map.containsKey(arr[i]))
        	{
        		list =map.get(arr[i]);
        		list.add(i);
        		map.put(arr[i],list );
        	}
        	else{
        		map.put(arr[i], list);
        	}
        }
        for(int i=1;i<=n;i++)
        {
        	if(arr[i]==0)
        		continue;
        	ArrayList<Integer> list= new ArrayList<Integer>();        
    	for(int s:map.keySet()){
    		if(map.get(s).contains(arr[i]))
    		{
    			list =map.get(s);
        		list.add(i);
        		map.put(s,list );
    		}
    	}
        }
        double end = System.currentTimeMillis();

       for(int s:map.keySet())
        System.out.println(s+" "+map.get(s));
        //System.out.println((end-start)/1000+"s");
        for(int s:map.keySet()){
        	ArrayList<Integer> list= new ArrayList<Integer>();
        	list=map.get(s);
        	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
			    if(Math.abs(integer-s)<=t)
			    	Sum++;
				
			}
        }
    System.out.println(Sum);
    }
 
  public static void  calculateABS(int p)
    {
 
    }
}