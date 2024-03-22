package assignments;
//Create 1 child class having main method ,
//1 abstarct class having 1 abstract method and 
//1 concrete method and interface having abstarct method
//and create relation between child class->Abstract class->Interface

interface method22
{
	void login();
}
abstract class method implements method22
{
    abstract void add1();
    static void sub1()
    {
    	System.out.println("sub");
    }
}
public class Assignment_51 extends method
{
	public static void main(String[] args) 
	{
		Assignment_51 A51 = new Assignment_51();
		A51.add1();
		A51.sub1();
		A51.login();
	}

	@Override
	public void login()
	{
		System.out.println("login");		
	}

	@Override
	void add1()
	{
		System.out.println("add1");
	}

}
