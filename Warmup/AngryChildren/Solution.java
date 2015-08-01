package Warmup.AngryChildren;
import java.util.Arrays;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int arr[]= new int [n];
		int k = Integer.parseInt(sc.next());
		for (int i = 0; i < n; i++) 
		arr[i]=Integer.parseInt(sc.next());	
		Arrays.sort(arr);
		int current=0,best=100000000;
		for(int i=0;i<n-k;i++){
			current=arr[i+k-1]-arr[i];
			if(current<best)
				best=current;
		}
		System.out.println(best);
		
		}

}
