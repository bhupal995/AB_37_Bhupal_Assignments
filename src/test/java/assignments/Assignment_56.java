package assignments;
//"Create child class having relation with interface(1st)
//1st interface having relation with 2nd interface
//2nd interface having relation with 3rd interface"

interface method56B
{
	void sub();
}
interface method56A extends method56B
{
	void mul();
}
interface method56 extends method56A
{
	void add();
}
public class Assignment_56 implements method56
{
	public static void main(String[] args) 
	{
		Assignment_56 A56 =new Assignment_56();
		A56.add();
		A56.sub();
		A56.mul();
	}
	@Override
	public void add()
	{
		System.out.println("add");
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

}
