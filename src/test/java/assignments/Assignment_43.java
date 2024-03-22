package assignments;
// WAP for single level inheritance in a single program 
//and make all methods non static(selenium,java,gk) by creating object in child class

class one 
{
	 void selenium()
	 {
		 System.out.println("selenium");
	 }

	 void java()
	 {
		 System.out.println("java");
	 }
	 void gk()
	 {
		 System.out.println("gk");
	 }
}

public class Assignment_43 extends one
{	
	
	public static void main(String[] args)
	{
		Assignment_43 A43 = new Assignment_43();
		A43.selenium();
		A43.java();
		A43.gk();
	}
}
