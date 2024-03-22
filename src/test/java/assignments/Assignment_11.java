package assignments;

public class Assignment_11 {

			// WAP where in a class, there are 5 methods(3static, 2non static) with same name....
			// first method argument is int a, second method argument is double a,third method argument is char a, 
			// fourth method argument is boolean a and fifth method argument is String a

			static void samename(int a)
			{
				System.out.println(a);
			}
			static void samename(double a)
			{
				System.out.println(a);
			}
			static void samename(char a)
			{
				System.out.println(a);
			}
			   void samename(boolean a)
			{
				System.out.println(a);
			}
			    void samename(String a)
				{
					System.out.println(a);
				}
	
	public static void main(String[] args) {
		
		samename(1);
		samename(1.2);
		samename('c');
		Assignment_11 A11 = new Assignment_11();
		A11.samename(true);
		A11.samename("prnit");
		
		
		
	}

}
