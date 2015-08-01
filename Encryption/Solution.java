package Encryption;
import java.util.Scanner;
public class Solution {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
     	String s = sc.nextLine();
     	//s="ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots";
		int l = s.length();
		int row = (int) Math.floor(Math.sqrt(l));
		int column =  (int) Math.ceil(Math.sqrt(l));
	    while(row*column<l)
	    	row++;
	    char [][] arr=new char[row][column];

	    int x=0,y=0;
		for(int i=0;i<row;i++) 
			for(int j=0;j<column;j++)
	        arr[i][j]=' ';
	    for(int i=0;i<l;i++){
			 
			 arr[x][y]=s.charAt(i);
			 y++;
			 if( ((y)%column) ==0)
				 {x++; y=0;}
		 }
			 
		int p=0,q=0;
int  k=0;
	    while(true) {
	    	if(arr[p][q]!=' '){
			System.out.print(arr[p][q]); k++;}
	    	if(k==l)
	    		break;
			p++;
			if(p%row==0){
				q++;p=0;
		    	System.out.print(" ");

			}
			}
	}

}
