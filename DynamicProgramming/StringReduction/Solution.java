package DynamicProgramming.StringReduction;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;


public class Solution {
public static void main(String [] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
	while(T-->0){
		String s = br.readLine();
    int temp=0;
        int l = s.length();
        for(int i=0;i<l-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
                continue;
            else{
                temp=1;
                break;
            }
        }
        if(temp==0)
            System.out.println(l);
        else{
           HashMap<Character, Integer> map = new HashMap<Character,Integer>();
           for(int i=0;i<l;i++){
        	if(map.containsKey(s.charAt(i)))
        	  map.put(s.charAt(i), map.get(s.charAt(i))+1);
        	else
        		map.put(s.charAt(i), 1);
           }
           
          int a= map.containsKey('a')?map.get('a'):0;
          int b= map.containsKey('b')?map.get('b'):0;
          int c =map.containsKey('c')?map.get('c'):0;
            System.out.println(a+" "+b+"  "+c);
          if((a==b&&b==c)||(a==0&&b==c)||(b==0&&a==c)||(c==0&&a==b))
        	  System.out.println("2");
          else
        	  System.out.println("1");
        }
    }
    }
}