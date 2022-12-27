import java.util.* ;
public class greetmessage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Marks out of 10:");
		int marks = sc.nextInt();
		switch(marks)
		{
		case 10:
		case 9:
		case 8:
		System.out.println("Excellent");
		break;
		case 7:
		System.out.println("Very Good");
		break;
		case 6:
		System.out.println("Good");
		break;
		case 5:
		System.out.println("Work Hard");
		break;
		case 4:
		System.out.println("Poor");
		break;
		case 3:
		case 2:
		case 1:
		case 0:
		System.out.println("Very Poor");
		break;
		default:
		System.out.println("Invalid value Entered");
		}
	}
}