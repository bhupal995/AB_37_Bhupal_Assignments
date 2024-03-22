package assignments;
// "Find out number of char and number of digits in below string
// Rahul123"
public class Assignment_81 
{
	public static void main(String[] args)
	{
		String name = "Testing1234";
		int charcount=0;
		int numcount=0;
		char c1[] = name.toCharArray();	
		for(int i=0;i<name.length();i++)
		{
			boolean ans =Character.isDigit(c1[i]);
				if(ans==true)
				{
					numcount++;
				}
				else
				{
					charcount++;
				}
		}		
		System.out.println(charcount);
		System.out.println(numcount);
	
	}
	
	

}
