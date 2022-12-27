import java.util.*;
public class ifelse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age ?");
		int age = sc.nextInt();
		
		if( age>=18)
			System.out.println("You can vote");
		else
			System.out.println("You can't vote");
	}
}