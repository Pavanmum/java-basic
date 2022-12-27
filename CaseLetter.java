import java.util.Scanner;
class CaseLetter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character:-");	
		String c=sc.next();
		char ch=c.charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println(c+" is upper case alphabet");
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println(c+" is lower case:-"+ch);
		}
		else
		{
			System.out.println("Enter only character ");
		}
	}
}
