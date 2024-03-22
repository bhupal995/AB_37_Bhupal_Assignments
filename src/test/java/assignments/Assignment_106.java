package assignments;
// WAP for return keyword for int and double
public class Assignment_106 {

	
	int add (int a, int b)
	{
		int sum =a+b;
		return sum;
	}
	
	
	double subtr ( int a, double b)
	{
		double sub = a-b;
		return sub;
	}
	
	public static void main(String[] args) 
	{
		Assignment_106 A106 = new Assignment_106();
		
		A106.add(5, 7);
		A106.subtr(10, 5.6);

	}

}
