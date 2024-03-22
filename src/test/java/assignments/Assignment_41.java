package assignments;

import java.util.Scanner;

public class Assignment_41
{
 //"WAP a program using  Switch(a) keyword case1:
//	addition, case2:subtraction, case3:multiplication, 
	//case4 And fetch the value of 'a' with scanner
	//class using next int() method."
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = s1.nextInt();
		System.out.println("Enter b value");
		int b = s1.nextInt();
		System.out.println(" Press 1 for addition"); 
		System.out.println(" Press 2 for subtraction"); 
		System.out.println(" Press 3 for mult");
		int c =s1.nextInt();
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
