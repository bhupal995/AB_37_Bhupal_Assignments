package assignments;
import java.util.Arrays;
//Check if 2 given strings are anagram of each other or not
public class Assignment_84
{
	public static void main(String[] args)
	{
		String a1 = "rto";
		String a2 = "toa";		
		if(a1.length() == a2.length()) 
		{
			char[] c1 = a1.toCharArray();
			char[] c2 = a2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("It is a anagram");
			}
			else
			{
				System.out.println("It is not a anagram");
			}
		}
		else
		{
			System.out.println("Not a anagram given");
		}
	}

}
