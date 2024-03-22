package assignments;
/*"String = GroTechMinds
Output 1= All capital letters in String a
Output 2= All small letters in String b
and print both the strings"
*/
public class Assignment_74 
{
	public static void main(String[] args)
	{
		String s1 = "GroTechMinds";
		
		String s2 = s1.toLowerCase();
		String s3 = s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2.concat(s3));
		
	}
}
