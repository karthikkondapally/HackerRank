package DynamicProgramming.StockMaximize;

import java.util.Scanner;

class Solution {
private static Scanner sc;

public static void main(String [] args){
 sc = new Scanner(System.in);
 int T = Integer.parseInt(sc.next());
 while(T-->0){
int n = Integer.parseInt(sc.next());
int a[] = new int[n];
for(int i=0;i<n;i++)
a[i]= Integer.parseInt(sc.next());
int stock=1;
int profit=0;
int sum=a[0];
for(int i=1;i<n;i++){
	if(i+1<n)
	if(a[i-1]<a[i] && a[i]<a[i+1])
	{
		stock++;sum+=a[i];
		continue;
	}
	if(a[i-1]<a[i])
	{ profit+=((stock*a[i])-sum); stock=0;sum=0;}
	else 
		{stock++;sum+=a[i];}
	

	
}

System.out.println(profit);


}

}
}
