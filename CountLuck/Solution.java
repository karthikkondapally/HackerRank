package CountLuck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class Solution {
	
static int row,column,visited[][],count=0,mRow=0,mCol=0,K=0,T,wand;
static char arr[][];
static Stack<List<Integer>> sb;
static ArrayList<List<Integer>>list = new ArrayList<List<Integer>>();
private static Scanner sc;
public static void main( String[] args){
    sc = new Scanner(System.in);
    sb= new Stack<List<Integer>>();
		 T=sc.nextInt();
		 int u=T;
		 while(T-->0){
         row = sc.nextInt();
		 column= sc.nextInt();
		 K=0;
		 count=0;
		 sb.empty();
		 list.clear();
		 arr= new char[row][column];
		 visited=new int[row][column];
		for(int i=0;i<row;i++)
		 	{
				String st=sc.next();
				for(int j=0;j<column;j++)
				{
              
				arr[i][j]=st.charAt(j);
				if(arr[i][j]=='M')
				{	mRow=i;mCol=j;}
				visited[i][j]=0;
				}
		 	}
		 wand =sc.nextInt();

	DFSLength(mRow, mCol);

while(!sb.empty())
{
  List<Integer> li = sb.pop();
  //System.out.println(li);
	list.add(li);
}
ArrayList<Integer> list1 = new ArrayList<Integer>() ;
list1.add(mRow);
list1.add(mCol);
list.add(list1);
checkImpressed(mRow,mCol, -4);
for(int i=list.size()-2;i>0;i--)
{
	if(K>wand)
		break;

checkImpressed(list.get(i).get(0),list.get(i).get(1),i);
}
if(K==wand)
	 System.out.println("Impressed");
else
	 System.out.println("Oops!");

		 }
		 

}
	private static void checkImpressed(int  x, int y,int listIndex) {
	// TODO Auto-generated method stub
		
		int rowNbr[] = { -1,  0, 0, 1};
	     int colNbr[] = { 0, -1, 1, 0};
	     int countPath=0;
	     for(int i=0;i<4;i++)
		  {   
	    	 if(safeImpressed(x+rowNbr[i], y+colNbr[i], listIndex))
		         countPath++;
		  }
	    // System.out.println();
      if(countPath>1)
      {	K++;
    // System.out.println("No of time wand use is "+K);
      }
      }
	private static boolean safeImpressed(int x, int y, int listIndex) {
		// TODO Auto-generated method stub


		if((x>=0&&x<row)&&(y>=0&&y<column))
		   if(listIndex==-4)
			   if(arr[x][y]!='X')
					return true;
		if(listIndex!=-4){
		
		
		if((x>=0&&x<row)&&(y>=0&&y<column))
			if((x!=list.get(listIndex+1).get(0))||(y!=list.get(listIndex+1).get(1)))
			if(arr[x][y]!='X')
				{return true;}}
		return false;
	}
	private static void  DFSLength(int thisrow, int thiscolumn) {
		// TODO Auto-generated method stub		
		int rowNbr[] = { -1,  0, 0, 1};
	     int colNbr[] = { 0, -1, 1, 0};
	     
	    // System.out.println("at "+arr[thisrow][thiscolumn]+" "+thisrow+" "+thiscolumn );
	     if((arr[thisrow][thiscolumn]=='M')&&(count!=1))
	     {
	    	 for(int i=0;i<4;i++)
	 		{    visited[thisrow][thiscolumn]=1;
	 		     if(safe(thisrow+rowNbr[i],thiscolumn+colNbr[i]) && count!=1)
	 			{
	 		    	 List<Integer>li = new ArrayList<Integer>();
	 		    	 li.add(thisrow+rowNbr[i]);
	 		    	 li.add(thiscolumn+colNbr[i]);
	 		    	 sb.push(li);
	 		    	// System.out.println("pushed"+li);
	 		    	 DFSLength(thisrow+rowNbr[i], thiscolumn+colNbr[i]);
	 			     if(count!=1)
	 			    	sb.pop();//System.out.println( sb.pop());
	 			}
	 		}
	     }
	     
	     if(arr[thisrow][thiscolumn]=='*')
	     { //System.out.println("found her at "+thisrow+" "+thiscolumn);
	      count=1;
	     }
	     if((arr[thisrow][thiscolumn]=='.')&&(count!=1)){
	    	 for(int i=0;i<4;i++)
		{    visited[thisrow][thiscolumn]=1;
		     if((safe(thisrow+rowNbr[i],thiscolumn+colNbr[i]))&&(count!=1))
		     {
		    	 List<Integer>li = new ArrayList<Integer>();
		    	 li.add(thisrow+rowNbr[i]);
		    	 li.add(thiscolumn+colNbr[i]);
		    	 if(visited[thisrow+rowNbr[i]][thiscolumn+colNbr[i]]!=1)
		    	 sb.push(li);
		    	// System.out.println("pushed"+li);
		    	 DFSLength(thisrow+rowNbr[i], thiscolumn+colNbr[i]);
			     if(count!=1)
			     { List pop=sb.pop();
			    // System.out.println("poped"+pop);
			     }
		     }
		}
	    	 }
	
	}
	private static boolean safe(int i, int j) {
		// TODO Auto-generated method stub
		
		if((i>=0&&i<row)&&(j>=0&&j<column))
			if(visited[i][j]!=1)
			   if((arr[i][j]=='.')||(arr[i][j]=='*'))
				return true;
		return false;
	}
}
