//package application;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Solution_2 {
   
	
	/*
	 * Complete the function below.
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
       String str1 = in.next();
       String str2 = in.next();
       HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
       for (int i = 0; i < str1.length(); i++) {
    	   Character c = str1.charAt(i);
    	   if(map1.containsKey(c)){
    		   map1.put(c, map1.get(c)+1);
    	   }else{
    		   map1.put(c, 1);
    	   }
	}
      // System.out.println(map1);
       for (int i = 0; i < str2.length(); i++) {
    	   Character c = str2.charAt(i);
    	   if(map1.containsKey(c)&&(str1.contains(c+""))){
    		   map1.put(c,map1.get(c)-1);
    	   }else{
    		   if(map1.containsKey(c))
    			   map1.put(c, map1.get(c)+1);
    		   else
    		   map1.put(c, 1);
    	   }
	}
       int count=0;
      Set<Character> set = map1.keySet();
      for (Character character : set) {
    	  count  = count +Math.abs(map1.get(character));
	}
      System.out.println(count);
      
	}
}
