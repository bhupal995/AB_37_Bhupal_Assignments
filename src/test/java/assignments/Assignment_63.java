package assignments;

import java.util.Arrays;
import java.util.Scanner;

//Create an array of length =5 of int datatype and fetch its value from scanner class.
public class Assignment_63
{

	public static void main(String[] args)
	{
		int num[] =new int[5];
		
		Scanner S1 =new Scanner(System.in);
		System.out.println("Enter the array values : ");
		num[0]=S1.nextInt();
		num[1]=S1.nextInt();
		num[2]=S1.nextInt();
		num[3]=S1.nextInt();
		num[4]=S1.nextInt();
		
		System.out.println("Array values are "+Arrays.toString(num));
		
	}

}
