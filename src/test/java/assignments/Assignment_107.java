package assignments;

import java.util.Scanner;

// WAP for return keyword for float , double , string , boolen , using scanner class
public class Assignment_107
{

	
	static float addd(float a, float b)
	{
	  float add = a+b;
	  return add;
	}
	
	static double addd(int a, float b)
	{
	  double sub = a-b;
	  return sub;
	}
	
	String name (String name1)
	{
		return name1;
	}
	
	boolean result (boolean result1)
	{
		return (result1);
	}
	
	public static void main(String[] args)
	{
		Assignment_107 a107 = new Assignment_107();
		
		Scanner s1 = new Scanner(System.in);
		 a107.addd(2, 2.2f);
		a107.name("Test");
		a107.result(false);
	}

}
