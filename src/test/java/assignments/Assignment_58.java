package assignments;

//WAP to access 4 different access specifiers within the package

class Assignment_58A
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

}

public class Assignment_58 extends Assignment_58A
{

	public static void main(String[] args)
	{
		Assignment_58 A58 = new Assignment_58();
		A58.add57();
		A58.mul57();
		A58.div();
	}

}
