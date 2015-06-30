import java.io.*;
import java.util.*;
public class Solution {
static String [] arr;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        arr = new String[T];
        for(int i=0;i<T;i++)
            arr[i]=sc.next();
        for(int i=0;i<T;i++)
            {
            int sum=0;
            for (int j=0;j<arr[i].length()-1;j++)
              {
              if(arr[i].charAt(j)==arr[i].charAt(j+1)) 
                  sum++;
            }
            System.out.println(sum);
        }
        
    }
}