package GridSearch;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.in
Scanner sc= new Scanner (System.in);
int T=sc.nextInt();
String arr[] =new String[T];

for(int i=0;i<T;i++)
	arr[i]="NO";
int l=T;
while(T>0){
	
	int row=Integer.parseInt(sc.next());
	int coulmn=Integer.parseInt(sc.next());
	String[] grid =new String[row];
	for(int i=0;i<row;i++)
		grid[i]=sc.next();
	
	int r =Integer.parseInt(sc.next());
	int c= Integer.parseInt(sc.next());
	String pattern[]= new String[r];
	for(int i=0;i<r;i++)
		pattern[i]=sc.next();
	
	
	for(int i=0;i<row;i++)
	{
		int flag=0;
		int j=0;
		if(grid[i].contains(pattern[j]))
		{
			int k=grid[i].indexOf(pattern[j]);
	                int p=i+1;
	                int q=j+1;
			while(true){
				
				if(q==r)
				{
					arr[T-1]="YES";
					flag=1;
					break;
				}
				if(grid[p].contains(pattern[q]))
				{
					if(grid[p].indexOf(pattern[q])==k)
					{
					p++;
					q++;
					}
					else
						break;
				}
				else
					break;
				
			}
		}
		if(flag==1)
			break;
		
	}
	
	T=T-1;
}

for(int i=l-1;i>=0;i--)
	System.out.println(arr[i]);
	}

}
