import java.util.*;
public class pattern4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many lines you want to Print.");
		int n = sc.nextInt();//4
		for(int i=0; i<=n; i++)
		{
			for ( int j=(n-i); j<=i; j++)         
			{  
				System.out.print(" ");
			}   
				for( int j=n; j>=i; j--)
				{			
					System.out.print("*");
				}
			System.out.println();
		}
	}
}