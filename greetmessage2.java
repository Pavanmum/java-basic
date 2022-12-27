import java.util.* ;
public class greetmessage2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Percentage:");
		int percentage = sc.nextInt();
		switch(percentage)
		{
		case 100:
		case 90:
		case 80:
		System.out.println("Excellent");
		break;
		case 70:
		System.out.println("Very Good");
		break;
		case 60:
		System.out.println("Good");
		break;
		case 50:
		System.out.println("Work Hard");
		break;
		case 40:
		System.out.println("Poor");
		break;
		case 30:
		case 20:
		case 10:
		case 0:
		System.out.println("Very Poor");
		break;
		default:
		System.out.println("Invalid value Entered");
		}
	}
}