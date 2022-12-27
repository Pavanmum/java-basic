import java.util.Scanner;
public class area
{
		public static void main(String []args){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Radius:");
			int r = sc.nextInt();
			System.out.println("Area of Circle="+3.142*r*r);
			System.out.print("Enter length of Rectangle:");
			int l = sc.nextInt();
			System.out.print("Enter width of Rectangle:");
			int w = sc.nextInt();
			System.out.println("Perimeter of Rectangle is "+l*w);
			System.out.print("Enter Height of Triangle:");
			int h = sc.nextInt();
			System.out.print("Enter Base of triangle:");
			int b = sc.nextInt();
			System.out.println("Area of Triangle is "+0.5*h*b);
		}
}