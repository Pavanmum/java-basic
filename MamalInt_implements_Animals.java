package animals;
interface animals;
interface animals
{
	public void eat();
	public void travel();
}
//MamalInt.java

package Animals;
public class MamalInt_implements_Animals
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