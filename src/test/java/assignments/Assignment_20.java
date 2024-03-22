package assignments;

public class Assignment_20 {
// WAP with 3 methods main,static add and static subtract. 
// Declare a and b as static global variables and initialize then in each method and perform addition and subtraction
	
	static int a;
	static int b;
	
	static void add()
	{
		a=10; b=20;
	    int	sum = a+b;
		System.out.println(sum);
	}
	
	static void sub()
	{
		a=20; b=10;
		int sub = a-b;
		System.out.println(sub);
	}
	
	public static void main(String[] args) {
		add();
		sub();

	}

}
