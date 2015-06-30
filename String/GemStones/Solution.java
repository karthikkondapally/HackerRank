import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        
       */
 String arr[]= new String[100];
       int count[] =new int[260];
        for(int i=0;i<260;i++)
            count[i]=-1;
        
       Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
            arr[i]=sc.next();
        try{
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length();j++){
         //   System.out.println((int)arr[i].charAt(j));
                
            	if(count[(int)arr[i].charAt(j)]==i-1)
            count[(int)arr[i].charAt(j)]=count[(int)arr[i].charAt(j)]+1;
                else 
                    continue;
            } }     }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        int Sum=0;
        for(int i=0;i<260;i++)
        	if(count[i]==n-1)
        	{  Sum=Sum+1; }
        System.out.println(Sum);
    }
}