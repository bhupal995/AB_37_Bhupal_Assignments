package assignments;
//Upcasting and downcasting Problem 4 as per Diagram during Class
class one13
{
	void login()
	{
		System.out.println("login");
	}
}
class two23 extends one13
{
	void logout() {
		System.out.println("logout");
	}
}
class three31 extends two23
{
	
	void logging() {
		System.out.println("logging");
	}
}
public class Assignment_92 extends three31 {
	void signoff() {
		System.out.println("signoff");
	}
	public static void main(String[] args) {
		three31 ABC = new three31();
		ABC.login();
		ABC.logging();
		ABC.logout();	
	}
}
