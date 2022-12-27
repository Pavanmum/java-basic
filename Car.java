class Car extends Vehicle
{
	int CC;
	int gears;
	Car(String c,int s,int sz,int cc,int g)
	{
		super(c,s,sz);
		CC=cc;
		gears=g;
	}
	void carattribute()
	{
		System.out.println("No of cc"+CC);
		System.out.println("No of gears"+gears);
	}
}