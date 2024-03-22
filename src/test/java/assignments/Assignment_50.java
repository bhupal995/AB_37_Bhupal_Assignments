package assignments;
//Create 1 child class and 2 interfaces ( both having 2-2 abstract methods in it) 
//and create relation between child class->interface(1st)->interface(2nd)
interface method1
{
	void login();
	void logout();
}
interface method2 extends method1
{
	void add();
	void sub();
}
public class Assignment_50 implements method2
{
	public static void main(String[] args)
	{
		Assignment_50 A50 =new Assignment_50();		
		A50.login();
		A50.logout();
		A50.add();
		A50.sub();
	}
	@Override
	public void add()
	{
		System.out.println("add");		
	}
	@Override
	public void sub()
	{
	System.out.println("sub");	
	}
	@Override
	public void login()
	{
		System.out.println("login");
	}
	@Override
	public void logout()
	{
	System.out.println("logout");	
	}
}
