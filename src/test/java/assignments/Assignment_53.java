package assignments;
//Do everything same as Assignment 52  but only with 4 interfaces instead of 2
interface method53
{
	void add();
}
interface method53A
{
	void sub();
}
interface method53B
{
	void mul();
}
interface method53C
{
	void div();
}
public class Assignment_53 implements method53, method53A,method53B,method53C
{
	public static void main(String[] args)
	{
		Assignment_53 A53 =new Assignment_53();
		A53.add();
		A53.sub();
		A53.mul();
		A53.div();
	}
	@Override
	public void div()
	{
		System.out.println("div");	
	}
	@Override
	public void mul() 
	{
	System.out.println("mul");		
	}
	@Override
	public void sub() 
	{
	System.out.println("sub");	
	}
	@Override
	public void add()
	{
		System.out.println("add");
	}

}
