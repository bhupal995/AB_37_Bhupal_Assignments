package assignments;
//findout the area of a circle for ten times
//take pi value from math.pi and
//take r value from math.random 
//and solve this problem 10 times.
public class Assignment_94 {

	public static void main(String[] args) {
			
		double pi = Math.PI;
		
		for(int i=0;i<=10;i++)
		{
			double r = Math.random();
			double Areofcircle = pi*r*r;
			System.out.println(Areofcircle);
		}

	}

}
