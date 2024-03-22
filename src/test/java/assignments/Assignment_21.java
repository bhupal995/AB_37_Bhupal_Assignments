package assignments;

public class Assignment_21 {
	//WAP with 3 methods main,static add and static subtract. 
	//Declare and initialize a and b global variables as non- static in nature and 
	//then perform addition and subtraction with static methods
	
	int a;
	int b;	
	static void add()
	{
		Assignment_21 A21 =new Assignment_21();
		int a1= A21.a=10;
		int a2= A21.b=20;
		int sum =a1+a2;
		System.out.println(sum);
	}
	static void sub()
	{
		Assignment_21 A21 =new Assignment_21();
		int a1= A21.a=10;
		int a2= A21.b=20;
		int sub =a1-a2;
		System.out.println(sub);	
	}
	public static void main(String[] args) {
		
		add();
		sub();
	}

}
