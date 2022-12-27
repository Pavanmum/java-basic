import java.util.* ;
public class simple_interest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount:");
		int A = sc.nextInt();
		System.out.println("Enter Interest rate:");
		int R = sc.nextInt();
		System.out.println("Enter Time(in yrs):");
		int T = sc.nextInt();
		System.out.println("Simple Interest is:"+A*R*T/100);
	}
}