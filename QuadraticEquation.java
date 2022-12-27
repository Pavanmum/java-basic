import java.util.Scanner;
class QuadraticEquation
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value for a :- ");
		a = sc.nextInt();
		System.out.print("Enter value for b :- ");
		b = sc.nextInt();
		System.out.print("Enter value for c :- ");
		c = sc.nextInt();
		System.out.println("The Quadratic Equation is "+a+"x^2+"+b+"x+"+c);
		double d,r1,r2;
		d = (b*b)-(4*a*c);
		System.out.println("The determinant value is "+d);
		if(d>0)
		{
			System.out.println("Root are real and unequal");
			r1 = (-b+Math.sqrt(d))/(2*a);
			r2 = (-b-Math.sqrt(d))/(2*a);
			System.out.println("Root 1 :- "+r1);
			System.out.println("Root 2 :- "+r2);
		}
		else if(d==0)
		{
			System.out.println("Root are real and equal");
			r1 = (-b+Math.sqrt(d))/(2*a);
			System.out.println("Root 1 :- "+r1);
		}
		else
		{
			System.out.print("Root are imaginary");
		}
	}
}