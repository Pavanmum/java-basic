package animals;
public class MamalInt
{
	public void eat()
	{
		System.out.println("Mamal eats");
	}
	public void travel()
	{
		System.out.println("Mamal travels");
	}
	public int noOfLegs()
	{
		return 0;
	}
	public static void main(String args[])
	{
		MamalInt m=new MamalInt();
		m.eat();
		m.travel();
	}
}