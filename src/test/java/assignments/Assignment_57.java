package assignments;
//Create a class with 4 different methods other than main method
//with 4 different access specifiers and try to access them within class

public class Assignment_57 
{


public static void add57()
{
	System.out.println("public");
}

private static void sub57()
{
	System.out.println("private");
}

protected static void mul57()
{
	System.out.println("protected");
}
 static void div()
 {
	 System.out.println("default");	 
 }

	public static void main(String[] args)
	{
		add57();
		sub57();
		mul57();
		div();
	}

}
