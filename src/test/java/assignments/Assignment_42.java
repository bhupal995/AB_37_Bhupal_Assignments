package assignments;

import java.util.Scanner;

public class Assignment_42
{
//	WAP using switch(a) keyword case1: addition of b&c, 
//	case2: subtraction of b&c, case3: multiplication of b&C, case4: division of b&c. 
// Fetch the value of a, b &c from scanner class using nextint() method. 
//	And print the output individually for all cases.
	public static void main(String[] args) 
	{
		
			Scanner s1 = new Scanner(System.in);
			System.out.println(" Press 1 for addition"); 
			System.out.println(" Press 2 for subtraction"); 
			System.out.println(" Press 3 for mult");
			int c =s1.nextInt();
			
			System.out.println("Enter a value");
			int a = s1.nextInt();
			System.out.println("Enter b value");
			int b = s1.nextInt();
			
			switch(c)
			{
			
				case 1 : int d =a+b;
						 System.out.println("addition : "+d);
						 break;
				case 2 : int e =a-b;
						 System.out.println("subtraction : "+e );
				         break;        
				case 3 : int f = a*b; 
					     System.out.println("multiplication : "+f );
		         		 break;
			}

		}

	}

