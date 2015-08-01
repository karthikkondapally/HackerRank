

package ConnectedCellInaGrid;
import java.util.Scanner;
public class Solution {
	
static int row,column,arr[][],visited[][],count=0;
	public static void main( String[] args){
      Scanner sc = new Scanner(System.in);
      
		 row = sc.nextInt();
		 column= sc.nextInt();
		 arr= new int[row][column];
		 visited=new int[row][column];
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				{
				arr[i][j]=sc.nextInt();
			visited[i][j]=0;
				}
				
		int Sum=-1;
        
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++){
				 count=0;

			  if(visited[i][j]!=1){
				 DFSLength(i,j);
				 Sum=Math.max(count, Sum);
			  }
			}
		System.out.println(Sum);
	}
	private static void  DFSLength(int thisrow, int thiscolumn) {
		// TODO Auto-generated method stub		
		int rowNbr[] = {-1, -1, -1,  0, 0,  1, 1, 1};
	     int colNbr[] = {-1,  0,  1, -1, 1, -1, 0, 1};
	      if(arr[thisrow][thiscolumn]==1){
	    	  count++;
	    	 for(int i=0;i<8;i++)
		{   visited[thisrow][thiscolumn]=1;
		     if(safe(thisrow+rowNbr[i],thiscolumn+colNbr[i]))
			DFSLength(thisrow+rowNbr[i], thiscolumn+colNbr[i]);
		}
	    	 }
		
	}
	private static boolean safe(int i, int j) {
		// TODO Auto-generated method stub
		
		if((i>=0&&i<row)&&(j>=0&&j<column))
			if(visited[i][j]!=1)
			   return true;
		return false;
	}
}
