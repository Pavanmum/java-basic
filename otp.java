import java.util.Random;

public class otp
{
	public static void main(String[] args)
	{
		String num="0123456789";
		int len=4;
		char[] otp=new char[len];
		Random r=new Random();
		for(int i=0;i<len;i++)
		{
			otp[i]=num.charAt(r.nextInt(num.length()));
		
		}
		System.out.println("Your otp is=:"+new String(otp));
	}
}