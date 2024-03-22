package assignments;
//Upcasting and downcasting Problem 3 as per Diagram
//during Class

class one11
{
	void login()
	{
		System.out.println("login");
	}
}
class two2 extends one11
{
	void logout() {
		System.out.println("logout");
	}
}


public class Assignment_91 extends two2{
	void signoff() {
		System.out.println("signoff");
	}

	public static void main(String[] args) {
		two2 t2 = new two2();
		t2.login();
		t2.logout();
		 
	}

}
