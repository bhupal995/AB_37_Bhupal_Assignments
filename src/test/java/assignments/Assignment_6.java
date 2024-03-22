package assignments;

public class Assignment_6 {

	// Write many non static method and call it inside the main method
	
	
	void add()
	{
		System.out.println("Non static method -1");
	}
	
	void mul()
	{
		System.out.println("Non static mehtod -2");
	}
	
	void sub()
	{
		System.out.println("Non static method -3");
	}
	public static void main(String[] args) 
	{
		Assignment_6 A6 =new Assignment_6();
		
		A6.add();
		A6.mul();
		A6.sub();
		
	}
}
