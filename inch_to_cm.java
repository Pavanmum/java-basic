public class inch_to_cm
{
	public static void main (String[] args) 
	{
		double inches=Double.parseDouble(args[0]);
		double cm = inches * 2.54;
		System.out.println("The Centimeter is: "+cm);
	}
}