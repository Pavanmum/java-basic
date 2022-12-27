public class areac2
{
		public static void main(String []args)
		{
			double r,area,per;
			r=Double.parseDouble(args[0]);
			area=Math.PI*r*r;
			per=2*Math.PI*r;
			System.out.println("When r= "+r+"\narea "+area+"\nperimeter = "+per);
		}
}