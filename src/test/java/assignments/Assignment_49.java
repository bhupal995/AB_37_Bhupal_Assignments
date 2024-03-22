package assignments;
//Create a class and in this create interface as Amazon with login 
//and logout methods also create child class 
//and create relation between them 

interface amazon
{
	void login();
	void logout();
}

public class Assignment_49 implements amazon
{
	public static void main(String[] args) 
	{
		Assignment_49 A49= new Assignment_49();
		A49.login();
		A49.logout();
	}
	@Override
	public void login() 
	{
		System.out.println("Login");	
	}
	@Override
	public void logout()
	{
		System.out.println("logout");	
	}
}
