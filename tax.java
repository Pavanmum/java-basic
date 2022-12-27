public class tax
{
	public static void main (String[] args) 
	{
		double price =Double.parseDouble(args[0]);
		double salestax = price * 0.0825;
		System.out.println("Price= "+price);
		System.out.println("Sales tax is " + salestax);
		System.out.println("Total Price: "+(price+salestax));
	}
}