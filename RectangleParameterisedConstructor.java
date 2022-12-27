import java.io.*;; 
class Rectangle 
{ 
	int l,b,a; 
	Rectangle(int x, int y) 
	{ 
		l = x; 
		b = y; 
	} 
	void GetArea() 
	{ 
		a=l*b; 
		System.out.println("Area of Rectangle is : "+a); 
	} 
}  
class RectangleParameterisedConstructor 
{ 
	public static void main(String args[]) 
	throws IOException 
	{ 
		BufferedReader  Br = new BufferedReader(new InputStreamReader(System.in)); 
		String lb; 
		int Length,Breadth; 
		System.out.println("Enter Length"); 
		lb=Br.readLine(); 
		Length=Integer.parseInt(lb);
		System.out.println("Enter Breadth"); 
		lb=Br.readLine(); 
		Breadth=Integer.parseInt(lb); 
		Rectangle Rect = new Rectangle(Length,Breadth); 
		Rect.GetArea(); 
	} 
}
