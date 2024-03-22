package assignments;
//Reverse a String and Print it
public class Assignment_82 
{

	public static void main(String[] args)
	{
		String name = "Testing123";	
		String output ="";
		for(int i=name.length()-1;i>=0;i--)
		{
			char reverse = name.charAt(i);
			output = output+reverse;
		}
		System.out.println(output);
	}

}
