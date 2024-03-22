package assignments;
//Create child class having relation with Abstract class
//and that abstract class is having relation with 2 different interfaces
interface method54A
{
	void success();
}

interface method54B
{
	void failure();
}
abstract class method54 implements method54A, method54B
{
	abstract void login();	
}
public class Assignment_54 extends method54 
{
	public static void main(String[] args)
	{
		Assignment_54 A54=new Assignment_54();
		A54.login();
		A54.success();
		A54.failure();
	}
	@Override
	void login()
	{
		System.out.println("login");		
	}
	@Override
	public void success()
	{
		System.out.println("success");		
	}

	@Override
	public void failure() 
	{
		System.out.println("failure");		
	}

}
