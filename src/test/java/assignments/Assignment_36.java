package assignments;
import java.util.Scanner;
public class Assignment_36 {
//WAP to do addition, subtraction,multiplication,
//division by using scanner class and  a and b as local variables
	static void add()
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("enter a value:");
		int a = S1.nextInt();
		System.out.println("Enter b value");
		int b=  S1.nextInt();
		int add =a+b;
		System.out.println("Addition of a + b ="+add);		
	}
	static void sub()
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("enter a value:");
		int a = S1.nextInt();
		System.out.println("Enter b value");
		int b=  S1.nextInt();
		int sub =a-b;
		System.out.println("Subtraction of a - b ="+sub);		
	}
	static void mul()
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("enter a value:");
		int a = S1.nextInt();
		System.out.println("Enter b value");
		int b=  S1.nextInt();
		int mul =a*b;
		System.out.println("Multiplication of a * b ="+mul);		
	}
	static void div()
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("enter a value:");
		int a = S1.nextInt();
		System.out.println("Enter b value");
		int b=  S1.nextInt();
		double div =a/b;
		System.out.println("Division of a / b ="+div);		
	}	
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();		
	}

}
