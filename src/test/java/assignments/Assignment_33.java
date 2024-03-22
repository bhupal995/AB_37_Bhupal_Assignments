package assignments;

public class Assignment_33 {
  // WAP to   calculate the area of circle.
  //(pi value should be final static local variable and initialise).

	final static double pi = 3.14;

	static void areaofcircle()
	{
	 int r =14;
	 double Areaofcricle = pi*r*r;
	 System.out.println(Areaofcricle);
	}
	
	public static void main(String[] args)
	{
		areaofcircle();
		
		int r = 7;
		double AOC = pi*r*r;
		System.out.println(AOC);
		
	}

}
