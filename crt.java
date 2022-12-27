import java.util.Scanner;
public class crt
{
		public static void main(String []args){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Radius:");
			int r = sc.nextInt();
			System.out.println("Perimeter of Circle="+2*3.142*r);
			System.out.print("Enter length of Rectangle:");
			int l = sc.nextInt();
			System.out.print("Enter width of Rectangle:");
			int w = sc.nextInt();
			System.out.println("Perimeter of Recangle is "+2*(l+w));
			System.out.print("Enter 1st side of triangle:");
			int a = sc.nextInt();
			System.out.print("Enter 2nd side of triangle:");
			int b = sc.nextInt();
			System.out.print("Enter 3rd side of triangle:");
			int c = sc.nextInt();
			System.out.println("Perimeter of Triangle is "+(a+b+c));
		}
}