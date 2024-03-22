package assignments;

public class Assignment_10 {

	// WAP to create a Class with 2 static and 2 non static methods, perform add and sub in first two.
	//     Multiply and divide in last two and call in main method.
	
	
	static void add()
	{
		int a =10;
		int b=25;
		int add = a+b;
		System.out.println(add);
	}
	
	static void sub()
	{
		int a=24;
		int b=15;
		int sub = a-b;
		System.out.println(sub);
	}
	
	void mult()
	{
		int a =10;
		int b = 20;
		int mult = a*b;
		System.out.println(mult);
	}
	
	void div()
	{
		int a =150;
		int b =10;
		double div = a/b;
		System.out.println(div);
	}
	
	public static void main(String[] args) 
	{
		
		add();
		sub();
		Assignment_10 A10 = new Assignment_10();
		A10.mult();
		A10.div();
	}

}
