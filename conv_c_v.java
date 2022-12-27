import java.util.* ;
public class conv_c_v
{
	public static void main (String args[])
	{
	int c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Fahrenheit:");
	int f = sc.nextInt();
	System.out.println("Celcius is "+(f-32)*0.5556);
	}
}	