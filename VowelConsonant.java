import java.util.Scanner;
class VowelConsonant
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Character :- ");	
		String c=sc.next().toLowerCase();
		char ch=c.charAt(0);
		if(ch>=97 && ch<=122)
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch =='o' || ch=='u')
			{
			System.out.println(ch+" is Vowel");
			}
			else
			{
				System.out.println(ch+" is Consonant");
			}
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" is a number");
		}
		else
		{
			System.out.println(ch+" is Special Character");
		}
	}
}
