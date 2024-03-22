package assignments;
// WAP for single level inheritance where gk method(child) is static 
//and parent(selenium and java) are non static.

class two
{
	void selenium() 
	{
		System.out.println("selenium");
	}
	void java()
	{
		System.out.println("java");
	}
}
public class Assignment_44 extends two{

	static void gk() 
	{
		System.out.println("gk");
	}
	public static void main(String[] args)
	{
		gk();
		Assignment_44 A44 = new Assignment_44();
		A44.selenium();
		A44.java();
		
	}
	
	
}
