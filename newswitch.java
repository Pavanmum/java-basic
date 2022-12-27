import java.util.*;
public class newswitch
{
   public static void main(String []args)
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First character of your friend's name(s,p,a,r,k)");
	String i = sc.next();
    switch(i)
    {
	 case "s":
	   System.out.println("Shubham");
	   break;
	 case "p":
	   System.out.println("Pavan");
	   break;
	 case "a":
	   System.out.println("Arjun");
	   break;
	 case "r":
       System.out.println("Raj");
       break;
	 case "k":
       System.out.println("Kundan");
       break;
	 default:
	   System.out.println("Enter Proper Character.");
    }
   }
}