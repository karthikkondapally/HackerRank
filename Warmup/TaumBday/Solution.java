package Warmup.TaumBday;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   int t = Integer.parseInt(sc.next());
   
   while(t-->0){
	   int white=Integer.parseInt(sc.next());
	   int black=Integer.parseInt(sc.next());
	   int wcost=Integer.parseInt(sc.next());
	   int bcost=Integer.parseInt(sc.next());
	   int ccost=Integer.parseInt(sc.next());
	   if(wcost+ccost>=bcost && bcost+ccost>=wcost)
	     System.out.println((long)wcost*white+(long)bcost*black);
	   if(wcost+ccost<bcost && bcost+ccost>=wcost)
		   System.out.println((long)wcost*white+(long)(wcost+ccost)*black);
	   if(wcost+ccost>=bcost && bcost+ccost<wcost)
		   System.out.println((long)(bcost+ccost)*white+(long)bcost*black);
   }
	}

}
