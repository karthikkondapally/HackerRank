package Greedy.LargestPermutation;

import java.util.Arrays;
import java.util.Scanner;
public class Solution {

	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int arr[] = new int[N+1];
		for(int i=1;i<=N;i++)
			arr[i]=sc.nextInt();
		int count[]=new int[N+1];
		Arrays.fill(count, 0);
		for(int i=1;i<=N;i++)
			count[arr[i]]=i;
		int i=N;
		int j=1;
		while(K-->0){
			if(i==0)
				break;
			if(count[i]==j){
				K++;
				i--;
				j++;
				continue;
			}
		int temp=arr[count[i]];
		arr[count[i]]=arr[j];
		arr[j]=temp;
		i--;
		j++;
		}
		for(int s:arr)
			if(s!=0)
			System.out.print(s+" ");
	}
}
