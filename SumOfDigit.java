import java.util.Scanner;
class SumOfDigit
{
	public static void main(String[] args)
	{
		System.out.print("Enter any number :- ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b,sum = 0;
		while(a>0)
		{
			b = a % 10;
			sum+=b;
			a = a/10;
		}
		System.out.println("Sum of digit of number is :- "+sum);
	}
}
