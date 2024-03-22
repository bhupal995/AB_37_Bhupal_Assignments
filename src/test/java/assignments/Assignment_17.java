package assignments;

public class Assignment_17 {
		//WAP with 4 constructors and 1 IIB
	{
		System.out.println("This is IIB");
	}
	
	Assignment_17()
	{
		System.out.println("This is construcotr -1");
	}
	Assignment_17(int a)
	{
		System.out.println("This is construcotr -2");
	}
	Assignment_17(double a)
	{
		System.out.println("This is construcotr -3");
	}
	Assignment_17(char a)
	{
		System.out.println("This is construcotr -4");
	}
	public static void main(String[] args)
	{
		new Assignment_17();
		new Assignment_17(1);
		new Assignment_17(2.5);
		new Assignment_17('c');
	}

}
