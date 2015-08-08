package Search.MaximiseSum;

import java.io.*;
import java.util.*;

public class Solution {
	public static  long M;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long T = sc.nextInt();
        long currentSum=0;
        long bestSum=0;
       
        while(T-->0)
        {
            long N = sc.nextLong();
            Item arr[] = new Item [ (int) N+1];
             M = sc.nextLong();
            currentSum=0;
            bestSum=-1;
            arr[0]=new Item(0, 0);
            for (int i = 1; i<=N; i++) 
				{
            	long temp=(arr[i-1].getitem()+(sc.nextLong()%M))%M;
            	bestSum=Math.max(bestSum, temp);
            	arr[i]=new Item(temp,i);
				}

            
            Arrays.sort(arr, new Comparator<Item>() {

				@Override
				public int compare(Item o1, Item o2) {
	
					return (int) (o1.getitem()-o2.getitem());
				}
			});
            
         
            
       /*  for(Item i :arr)
            	System.out.print(i.getitem()+" ");
         System.out.println("");
         for(Item i :arr)
         	System.out.print(i.getindex()+" ");
         */
         
		long min=Long.MAX_VALUE;
            for(int i=(int) N-1;i>0;i--){
            	if(arr[i].getindex()>arr[i+1].getindex())
            		if(arr[i].getitem()-arr[i+1].getitem()<min)
            			min=Math.max(bestSum,modul(arr[i].getitem()-arr[i+1].getitem()));
            }
            System.out.println(min);
        }
        
    }

	private static long modul(long l) {
		// TODO Auto-generated method stub
		
		while(l<0)
			l=l+M;
		return l;
	}
    
  }

 class Item {
	
	 long item;
	 int index;

	public Item(long item,int index){
		this.item=item;
		this.index=index;
		
	}
	
	long getitem(){
		return item;
	}
	int getindex(){
		return index;
	}
}