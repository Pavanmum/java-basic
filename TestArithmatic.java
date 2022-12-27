import java.util.*;
class arithmatic
{
	public String add(double i,double j)
	{
		return("Addition of "+i+" and "+j+" is "+(i+j));
	}
	public String sub(double i,double j)
	{
		return("Subtraction of "+i+" and "+j+" is "+(i-j));
	}
	public String mul(double i,double j)
	{
		return("Multiplication of "+i+" and "+j+" is "+(i*j));
	}
	public String div(double i,double j)
	{
		return("Division of "+i+" and "+j+" is "+(i/j));
	}
}
public class TestArithmatic
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. 1");
		double i=sc.nextDouble();
		System.out.println("Enter no. 2");
		double j=sc.nextDouble();
		arithmatic a= new arithmatic();
		System.out.println(a.add(i,j));
		System.out.println(a.sub(i,j));
		System.out.println(a.mul(i,j));
		System.out.println(a.div(i,j));
	}
}