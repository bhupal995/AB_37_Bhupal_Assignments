package assignments;
//Take any alphanumeric String and check at which position there is numeric value
public class Assignment_80 {

	public static void main(String[] args) 
	{
		String name ="Testing123";
		
		char c1[] = name.toCharArray();
		
		for(int i=0; i<name.length();i++)
		{
			boolean ans =Character.isDigit(c1[i]);
			
			if(ans==true)
			{
				System.out.println(i);
			}
		}		

	}

}
