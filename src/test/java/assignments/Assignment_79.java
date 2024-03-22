package assignments;
//Take any alphanumeric String and find out which are numeric values and characters 
//and print it
public class Assignment_79
{
	public static void main(String[] args)
	{
		String name ="Testing123";
		char c1[] = name.toCharArray();	
		for(int i=0;i<name.length();i++)
		{
			boolean ans =Character.isDigit(c1[i]);
				if(ans==true)
				{
					System.out.println("It is a digit"+"  "+c1[i]);
				}
				else
				{
				System.out.println("It is a char"+"  "+c1[i]);
				}
		}
	}
}
