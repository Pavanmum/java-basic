import java.util.*;
public class inputnameage
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = s.nextLine();
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		System.out.println(name+"Pagal hai");
		System.out.println("mai"+age+"saal ki hu phir bhi padhnne nahi aata");
	}
}
		