package DynamicProgramming.Equal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solution {

	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int N = Integer.parseInt(br.readLine());
			String s[] = br.readLine().split(" ");
			int arr[] = new int[N];
			for(int i=0;i<N;i++)
				arr[i]= Integer.parseInt(s[i]);
			Arrays.sort(arr);
			int Sum=0,t=0,k=1,flag=0;
			while(true){
				for(int i=k-1;i<N-1;i++)
				{
					if(arr[i]<arr[i+1])
					{
						t=arr[i+1]-arr[i];
						if(t>=5)
							t=5;
						else if(t>=2&&t<5)
							t=2;
						else
							t=1;
						k=i+1;
						break;
					}
											
				}
				//System.out.println(t);
				
				if(t!=-2)
				for(int i=0;i<N;i++)
				{
					if(i!=k)
					arr[i]=arr[i]+t;
				}
				flag=0;
				
				for(int i=0;i<N-1;i++)
				{
					if(arr[i]<arr[i+1])
						{
						flag=1;
						break;
						}
				}
				Sum++;
				if(flag==0)
					break;
			
			}
			System.out.println(Sum);
		}
	}
}
