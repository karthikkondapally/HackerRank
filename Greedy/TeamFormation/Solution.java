package Greedy.TeamFormation;
import java.util.Arrays;
import java.util.Scanner;
public class Solution {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
int T=Integer.parseInt(sc.nextLine());

while(T-->0){
int l = Integer.parseInt(sc.next());

if(l==1){
	sc.next();
	System.out.println(1);
	continue;
}
int[]arr=new int[l];
for(int i=0;i<l;i++)
	arr[i]=sc.nextInt();
Arrays.sort(arr);
int sum=99999999,k=0;
for(int i=0;i<l-1;i++){

	if(arr[i]==arr[i+1])
	{

		k++;
		if(sum>k){
			sum=k;k=0;}
		if(i==l-2)
			sum=1;

	}
	if(arr[i+1]==arr[i]+1)
		k++;
  if(arr[i+1]>arr[i]+1)
  {
		k++;
		if(sum>k){
			sum=k;k=0;}  
		if(i==l-2)
			sum=1;
  }
	
	
}
if(sum==99999999)
	sum=l;
System.out.println(sum);
}


	}

}
