package assignments;
//Create child class and 2 interfaces and create relation of child class with interface(1st) 
//and relation of child class with interface(2nd) and achieve multiple level inheritance
interface method52
{
	void add();
	void sub();
}
interface method52A
{
	void mul();
	void div();
}
public class Assignment_52 implements method52, method52A
{
	public static void main(String[] args)
	{
		Assignment_52 A52 = new Assignment_52();
		A52.add();
		A52.sub();
		A52.mul();
		A52.div();
	}
	@Override
	public void mul()
	{
		System.out.println("mul");
	}
	@Override
	public void div()
	{
		System.out.println("div");	
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

}
