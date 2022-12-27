class Vehicle
{
	String color;
	int speed;
	int size;
	Vehicle(String c,int s,int sz)
	{
		color=c;
		speed=s;
		size=sz;
	}
	void printattributes()
	{
		System.out.println("Color:"+color);
		System.out.println("Speed:"+speed);
		System.out.println("Size:"+size);
	}
}