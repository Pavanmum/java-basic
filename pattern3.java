import java.util.*;
public class pattern3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many lines you want to Print.");
		int n = sc.nextInt();
		for(int i=0; i<=n; i++)
		{
			for ( int j=3*(n-i); j>=1; j--)         
			{  
				System.out.print(" ");
			}   
				for( int j=0; j<=i; j++)
				{			
					System.out.print("* ");
				}
			System.out.println();
		}
	}
}