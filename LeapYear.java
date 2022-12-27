import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any YEAR :- ");
		int y = sc.nextInt();
		if((y%4==0 && y%100!=0)||y%4000==0)
			System.out.printf("Year %d is leap year",y);
		else
			System.out.printf("Year %d is not a leap year",y);
	}
}
