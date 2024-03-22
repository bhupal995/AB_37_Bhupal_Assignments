package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

//"WAP to handle below 2 exceptions by using 2 catch blocks
//Scanner s1= new Scanner
//int c = 1/0;
//int a = s1.nextint();"
public class Assignment_61
{

	public static void main(String[] args)
	{
		
		try {
			Scanner s1= new Scanner(System.in);
			int a = s1.nextInt();
			int c = 1/0;	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		catch(InputMismatchException i)
		{
			System.out.println(i);
		}
		
	}

}
