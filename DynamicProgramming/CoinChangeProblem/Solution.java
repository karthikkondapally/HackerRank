package DynamicProgramming.CoinChangeProblem;
import java.util.Scanner;
public class Solution {
public static void main(String[] args)  {
//INPUT
Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int m = Integer.parseInt(sc.next());
	int s[] = new int[m];
	for(int i=0;i<m;i++)
		s[i]= Integer.parseInt(sc.next());
System.out.println(	count(s,m,n));
	
}


public static long count( int S[], int m, int n )
{
    int i, j; long x, y;
 
    long table[][]= new long [n+1][m];
    
    for (i=0; i<m; i++)
        table[0][i] = 1;
 
    for (i = 1; i < n+1; i++)
    {
        for (j = 0; j < m; j++)
        {
            x = (i-S[j] >= 0)? table[i - S[j]][j]: 0;
            y = (j >= 1)? table[i][j-1]: 0; 
            table[i][j] = x + y;
        }
    }
    return table[n][m-1];
}

}