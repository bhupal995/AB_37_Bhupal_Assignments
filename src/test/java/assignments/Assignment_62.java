package assignments;

import java.util.Scanner;

//"WAP by using throw keyword
//if the age of a person is > 18 then allow him to access www.google.com else throw an ArithmeticException"
public class Assignment_62
{

	public static void main(String[] args) throws Exception
	{
		Scanner S1 =new Scanner(System.in);
		System.out.println("Enter your age");
		int age =S1.nextInt();
		
		if(age>18)
		{
			System.out.println("Accessing to www.google.com");
		}
		else {
			throw new Exception("Not allowing");
		}	
		
	}

}
