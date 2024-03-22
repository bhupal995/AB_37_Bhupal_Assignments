package assignments;
//create a class and create two concrete methods inside a class(static add, non static sub), create abstract class and create two abstract mthods (multiplication, divison),create two concrete methods inside main method
class contremet
{
	static void add()
	{
		System.out.println("add");
	}
	void sub()
	{
		System.out.println("sub");
	}
}
abstract class abstcl extends contremet
{
	abstract void mult();
	abstract void division();
}
public class Assignment_48 extends abstcl
{
	static void one()
	{
		System.out.println("one");
	}
	static void two()
	{
		System.out.println("two");
	}
		public static void main(String[] args)
	{
		one();
		two();
		Assignment_48 A48=new Assignment_48();
		A48.mult();
		A48.division();
		add();
		A48.sub();
	}
	@Override
	void mult() {
		System.out.println("mult");
	}
	@Override
	void division() {
		System.out.println("division");
	}
}
