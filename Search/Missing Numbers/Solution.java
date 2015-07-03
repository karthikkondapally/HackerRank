

import java.io.*;
import java.util.*;

public class Solution {
// static int arr1[]= new int[1000011];
    static int count1[]= new int[10001];
    static int count2[]= new int[10001];
  //  static int arr2[]= new int[1000011];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       for(int i =0;i<10001;i++){
           count1[i]=0;
           count2[i]=0;
       }
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
        	int k =sc.nextInt();
            count1[k]=count1[k]+1;}
        int m= sc.nextInt();
        for(int i=0;i<m;i++)
        { int k=sc.nextInt();
            count2[k]=count2[k]+1;
        }
        for(int i=0;i<10001;i++){
        //	if(count1[i]!=0)
        	//	System.out.print(i+ " "+ count1[i]+ " "+count2[i]+" ");
            if(count1[i]!=count2[i])
            System.out.print(i+" ");}
    }
}