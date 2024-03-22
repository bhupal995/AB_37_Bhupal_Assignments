package assignments;

import java.util.Scanner;

public class Assignment_35 {

	//WAP to get inputmismatch error using scanner class for all the data types
	
	public static void main(String[] args)
	{
		Scanner S1 = new Scanner(System.in);	
		System.out.println("Enter the int number");
		S1.nextInt();
		System.out.println("Enter the byte number");
		S1.nextByte();
		System.out.println("Enter the short number");
		S1.nextShort();
		System.out.println("Enter the long number");
		S1.nextLong();
		System.out.println("Enter the float number");
		S1.nextFloat();
		System.out.println("Enter the double number");
		S1.nextDouble();
		System.out.println("Enter the boolean number");
		S1.nextBoolean();
	}  
}
