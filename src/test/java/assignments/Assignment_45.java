package assignments;
// WAP for multilevel inheritance in a single program and make all the methods are non static

class three
{
	void java()
	{
		System.out.println("java");
	}
}

class four extends three
{
	void selenium()
	{
		System.out.println("selenium");
	}
}

public class Assignment_45 extends four {

	void gk()
	{
	System.out.println("gk");	
	}
	public static void main(String[] args) 
	{
		Assignment_45 A45 =new Assignment_45();
		
	    A45.gk();
	    A45.selenium();
	    A45.java();
		
		

	}

}
