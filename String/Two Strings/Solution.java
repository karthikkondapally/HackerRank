import java.io.*;
import java.util.*;

public class Solution {
  static int count1[],count2[];
  static String str1[],str2[];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
       str1= new String[T];
       str2=new String[T];
        for(int i=0;i<T;i++){
         str1[i]= sc.next();
         str2[i]= sc.next();
        }
        count1 = new int[256];
        count2 = new int[256];
        
        int temp=0;
        for(int k=0;k<T;k++){ 
            
            for(int i=0;i<255;i++)
                count1[i]=0;
            for(int i=0;i<255;i++)
                count2[i]=0;
            
        	temp=0;
        for(int i=0;i<str1[k].length();i++)
           count1[(int)str1[k].charAt(i)]+=1;
          for(int i=0;i<str2[k].length();i++)
            count2[(int)str2[k].charAt(i)]+=1;
        
    for(int i=0;i<255;i++)
        if(count1[i]>=1&&count2[i]>=1)
             temp=1;
    if(temp==1)
        System.out.println("YES");
    else
    	System.out.println("NO");
        }
    }
}