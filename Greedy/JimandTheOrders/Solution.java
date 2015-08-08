package Greedy.JimandTheOrders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Solution {
	static int arr[] = new int [2];
	static String str[];
	static HashMap<Integer, Integer> set = new HashMap<>();
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int noOfOrders = Integer.parseInt(br.readLine());
    int t=noOfOrders;
    while (t-->0){
    	str=br.readLine().split(" ");
    	arr[0]=Integer.parseInt(str[0]);
    	arr[1]=Integer.parseInt(str[1]);
    	set.put(arr[0]+arr[1], noOfOrders-(t));
    }
List<Integer> sortedkeys = new ArrayList<Integer>(set.keySet());
Collections.sort(sortedkeys);


for (Iterator<Integer> iterator = sortedkeys.iterator(); iterator.hasNext();) {
	int key =(Integer) iterator.next();
System.out.print(set.get(key)+" ");
	
}
	}

}
