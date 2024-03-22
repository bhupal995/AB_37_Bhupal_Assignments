package assignments;

import java.util.Scanner;

public class Assignment_39 
{
	//WAP by taking value of age from scanner class and 
	//if age is greater than or equal to 18 then print " i am adult"
	//else print " i am young"
		
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println(" Enter your age");
		int a =s1.nextInt();
		if (a>=18)
		{
			System.out.println("i am adult");
		}
		else
		{
			System.out.println("i am young");
		}
	}

}
