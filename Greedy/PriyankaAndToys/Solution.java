package Greedy.PriyankaAndToys;
import java.util.Arrays;
import java.util.Scanner;
public class Solution {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		  arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int sum=0;
		for(int i=0;i<n;i++)
		{
			
			if(i<=n-2&&arr[i]+4>=arr[i+1])
			{
			int p=i+1;
			while(p<n&&arr[i]+4>=arr[p] )
				p++;
			sum++;
			i=p-1;
			}
			else
				sum++;
			
		}
		System.out.println(sum);	
	}
}
