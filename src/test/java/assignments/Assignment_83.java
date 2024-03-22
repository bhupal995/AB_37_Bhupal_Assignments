package assignments;
//Check if the String is Palindrome
public class Assignment_83
{
	public static void main(String[] args) 
	{
		String name = "Dad";	
		String output ="";
		String name1= name.toLowerCase();
		for(int i=name1.length()-1;i>=0;i--)
		{
			char reverse = name1.charAt(i);
			output = output+reverse;
		}
		System.out.println(output);
		
		if(output.equals(name1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
