package UtopianTree;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        int flag=0;
        int sum=1;
        for(int i=0;i<n;i++)
            {
        	a[i]=sc.nextInt();
            }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<a[i];j++)
                {
                 if(flag==0)
                     sum=2*sum;
                if(flag==1)
                    sum=sum+1;
                flag=1-flag;
                
            }
            System.out.println(sum);
            sum=1;
            flag=0;
        }
    }
}