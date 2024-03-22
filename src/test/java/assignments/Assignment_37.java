package assignments;

import java.util.Scanner;

public class Assignment_37 {
	 //WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as global variables
	static int a;
	static int b;
	
	static void add()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a value:");
		a =s1.nextInt();
		System.out.println("Enter b value:");
		b= s1.nextInt();
		int add=a+b;
		System.out.println("addition of a+b :"+add);
	}
	static void sub()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a value:");
		a =s1.nextInt();
		System.out.println("Enter b value:");
		b= s1.nextInt();
		int add=a-b;
		System.out.println("subtraction of a-b :"+add);
	}
	
	static void mult()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a value:");
		a =s1.nextInt();
		System.out.println("Enter b value:");
		b= s1.nextInt();
		int mult=a*b;
		System.out.println("addition of a*b :"+mult);
	}
	
	static void div()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a value:");
		a =s1.nextInt();
		System.out.println("Enter b value:");
		b= s1.nextInt();
		double div=a/b;
		System.out.println("addition of a/b :"+div);
	}
	
	public static void main(String[] args)
	{
		add();
		sub();
		mult();
		div();
	}

}
