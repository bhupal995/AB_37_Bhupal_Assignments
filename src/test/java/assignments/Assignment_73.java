package assignments;
//"WAP for below (You can take your name )
//String = ""My Name Is Manish""
//Output : M N I M. 
//After printing this remove all the spaces from the output and print it"
public class Assignment_73
{

	public static void main(String[] args) 
	{
		String s1 = "My Name Is Ram";
		
		String s2 = s1.replaceAll("[a-z]", "");
		System.out.println(s2);
		
		String s3 =s2.replaceAll(" ", "");		
		System.out.println(s3);
	
	}
}
