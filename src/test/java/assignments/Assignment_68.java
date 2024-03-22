package assignments;
//"M1=""Software"";M2=""Testing"";
//Output should print as:SoftwareTesting in a vertical way like below
/*S
o
f
.
.
g
*/


public class Assignment_68 
{
	public static void main(String[] args)
	{
		
		String s1 = "Software";
		String s2 = "Testing";
		
		String s3 = s1.concat(s2);
		
		for(int i=0;i<s3.length();i++)
		{
			System.out.println(s3.charAt(i));
		}
		
		
		
	}

}
