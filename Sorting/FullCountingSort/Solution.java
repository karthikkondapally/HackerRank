package Sorting.FullCountingSort;
import java.util.Scanner;

public class Solution {

    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in );
        int n = sc.nextInt();
        int arr[] = new int [n];
        String stringArr[] = new String[100];
          
        for (int i=0;i<100;i++)
        stringArr[i]="";
                
   
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); 
            if(i<n/2 )
            {    
               sc.nextLine(); stringArr[arr[i]]=stringArr[arr[i]].concat("- "); 
            }
            else
               stringArr[arr[i]]= stringArr[arr[i]].concat(sc.next()+" ");
        }
     
             for(int i=0;i<100;i++)
             System.out.print(stringArr[i]);      
    }
}
