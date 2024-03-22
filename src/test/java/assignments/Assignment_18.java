package assignments;

public class Assignment_18 {
	//WAP with local variable
	
	static void localvar()
	{
		int a;  // a is local variable
		a =10;
		System.out.println(a);
	}
	
	void varuable1()
	{
		String name= "variable";   // name - local variable
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		localvar();	
		Assignment_18 A18 = new Assignment_18();
		A18.varuable1();
	}

}
