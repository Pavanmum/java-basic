import java.util.*;
import java.io.*;
class Arithmatic
{
	public String add(double i,double j)
	{
		return(" Addition of " +i+ "  and " +j+ "  is  " +  (i+j) );
	}
	public String sub(double i,double j)
	{
		return("Subtraction of " +i+ "  and  " +j+   "is"   +(i-j) );
	}
	public String mul(double i,double j)
	{
		return("Multiplication of " +i+ "  and  "  +j+   "is"    +(i*j) );
	}
	public String div(double i,double j)
	{
		return("Divison of " +i+ "  and  " +j+  "  is  "     +(i/j) );
	}
}
class calc
{
	public static void main(String[] args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first element:");
		double i=sc.nextDouble();
			System.out.println("Enter second element:");
		double j=sc.nextDouble();
		Arithmatic a=new Arithmatic();
		System.out.println(a.add(i,j));
		System.out.println(a.sub(i,j));
		System.out.println(a.mul(i,j));
		System.out.println(a.div(i,j));
	}
}
