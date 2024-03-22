package assignments;
//"Create child class having relation with abstract class
//that abstract class having relation with interface(1st) &
//that interface(1st) having relation with another interface(2nd)"

interface method55B
{
	void mul();
}
interface method55A extends method55B
{
	void sub();
}
abstract class method55 implements method55A
{
	static void add()
	{
	System.out.println("add");	
	}
}
public class Assignment_55 extends method55
{
	public static void main(String[] args) 
	{
		Assignment_55 A55 =new Assignment_55();
		A55.add();
		A55.sub();
		A55.mul();
	}
	@Override
	public void sub() 
	{
	System.out.println("sub");		
	}
	@Override
	public void mul()
	{
	System.out.println("mul");			
	}

}
