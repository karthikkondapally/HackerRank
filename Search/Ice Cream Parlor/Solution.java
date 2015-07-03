import java.io.*;
import java.util.*;

public class Solution {
static int arr[][];
    static int N[];
    static int M[];
    static int O[];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
        int T =  sc.nextInt();
        arr=new int[T][100000];
        N=new int[T];
        M=new int[T];
        O=new int[T];
        for(int i=0;i<T;i++)
            {
            M[i]=sc.nextInt();
            N[i]=sc.nextInt();
            for(int j =0;j<N[i];j++)
                arr[i][j]=sc.nextInt();
        }
        
        for(int i=0;i<T;i++)
            iceCreamParlor(i);
    }
    
    public static void iceCreamParlor(int s)
    {
        int flag=0;
      for(int i=0;i<N[s];i++){
          for(int j=0;j<N[s];j++)
          {
          if(i!=j)
              {
              if(arr[s][i]+arr[s][j]==M[s])
                  {
                  System.out.println((i+1)+" "+ (j+1));
                  flag=1;
                  break;
              }
          }
          
          }
      if(flag==1)
              break;
      }
    }
}