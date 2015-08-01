package DynamicProgramming.JimandTheOrders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Solution_jim {
	static int arr[] = new int [2];
	static String str[];
    static Item item[] ;
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int noOfOrders = Integer.parseInt(br.readLine());
    int t=noOfOrders;
    item = new Item[t];
    int i=0;
    while (t-->0){
    	str=br.readLine().split(" ");
    	arr[0]=Integer.parseInt(str[0]);
    	arr[1]=Integer.parseInt(str[1]);
    item[i]=new Item(arr[0]+arr[1], noOfOrders-t);
    	i++;
    }
    
    
    Arrays.sort(item, new Comparator<Item>() {

		@Override
		public int compare(Item o1, Item o2) {
			return (o1.gettotalTime()<o2.gettotalTime()) ? -1 :
                (o1.gettotalTime() > o2.gettotalTime()) ? 1 :
                (o1.getOrder() < o2.getOrder()) ? -1 : 1;
		}
		
	});
    
    
for(i=0;i<noOfOrders;i++){
	System.out.print(item[i].getOrder()+" ");
}

}
	}
	
	
	
	class Item  {

	     private int  totaltime;
	        private int order;

	        public Item(int totaltime, int order) {
	            this.totaltime = totaltime;
	            this.order = order;
	        }

	        public int gettotalTime() {
	            return totaltime;
	        }

	        public int getOrder() {
	            return order;
	        }






	}
	

