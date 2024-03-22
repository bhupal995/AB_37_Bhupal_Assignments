package assignments;

import java.util.Scanner;

public class Assignment_38 {
//WAP to find area of triangle by taking values of b and h from scanner class
	
	
	public static void main(String[] args) 
	{
	
		Scanner s1 = new Scanner(System.in);
	    System.out.println("Enter b value");
		double b = s1.nextDouble();
		System.out.println(" Enter h value");
		double h = s1.nextDouble();
		
		double aot = .5*b*h;
		System.out.println("Area of triangle is "+aot);
	}

}
