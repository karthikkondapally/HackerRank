//package PalindromeIndex;
import java.util.Scanner;
public class Solution_2 {
static int length,flag=0,T;
 static int out[];
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       
       Scanner sc = new Scanner(System.in);
        T= Integer.parseInt(sc.next());
       int m=T;
       out= new int[T];
       while(T>0)
       {
           StringBuilder sb = new StringBuilder();
           String str= sc.next();
            length = str.length();
         // System.out.println(length);
            sb.append(str);
          if(str.equals(sb.reverse().toString()))
            out[T-1]=-1;          else
               checkPalindromeIndex(str);
          T=T-1;
          }

       for(int i=m-1;i>=0;i--)
           System.out.println(out[i]);
    }

    private static void checkPalindromeIndex(String str) {
      int j=length-1;
for(int i=0;i<length/2;i++){
	if(str.charAt(i)==str.charAt(j) )
	{j--;continue;}
	else
	{
		if(str.charAt(i)==str.charAt(j-1)&&(!(str.charAt(i+1)==str.charAt(j))|| ((str.charAt(i)==str.charAt(j-1)) &&(str.charAt(i+1)==str.charAt(j-2)) &&(str.charAt(i+2)==str.charAt(j-3)) )   ))
			{out[T-1]=j;break;}
		else
			{out[T-1]=i;  break;}
    }
}
    }

}