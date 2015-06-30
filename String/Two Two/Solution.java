/*
Runtime Error
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution_two {
public static void main(String [] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
	while(T-->0){
		String s = br.readLine();
		if(s.charAt(0)=='0')
			s=s.substring(1,s.length()-1);
        int count=0;
		int l =s.length();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<l;i++){
			sb.setLength(0);
			for(int j=i;j<l;j++){
				if(i==j)
					sb.append(s.charAt(i));
				else{
					sb.append(s.charAt(j));
				}
			Long x = Long.parseLong(sb.toString());
			if(powerTwo(x))
				count++;
			
			}
		}
		System.out.println(count);
	}
}

public static boolean powerTwo(Long x){
	
	if(x==0)
		return false;
    if ((x & -x) == x) {
        return true;
    }
    return false;
	
}
}
