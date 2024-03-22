package assignments;
// write a program for hierarchical inheritance 
//and create a three classes(son, daughter, parent) in a single program

class parent
{
	static void parent1()
	{
		System.out.println("Parent");
	}
}
class son extends parent
{
	static void son1()
	{
		System.out.println("son");
	}
}
class daughter extends son
{
	static void daughter()
	{
		System.out.println("daughter");
	}
}
public class Assignment_46 extends daughter
{
	public static void main(String[] args)
	{	
		Assignment_46 A46 =new Assignment_46();
		A46.daughter();
		A46.parent1();
		A46.son1();
	}

}
