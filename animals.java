package animals;
interface animals;
interface animal1
{
	public void eat();
	public void travel();
}
//MamalInt.java

package animals;
public class MamalInt implements Animals
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