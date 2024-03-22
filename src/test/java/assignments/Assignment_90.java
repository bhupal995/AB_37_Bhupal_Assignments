package assignments;
//Upcasting and downcasting Problem 2 as per Diagram during Class
import java.nio.file.spi.FileSystemProvider;
import javax.swing.plaf.synth.SynthOptionPaneUI;

class A
{
	void login()
	{
		System.out.println("login");
	}
}
class B extends A
{
	void logout() {
		System.out.println("logout");
	}
}
public class Assignment_90 extends B {
	void signoff() {
		System.out.println("signoff");
	}
	public static void main(String[] args)
	{
		A A1= new A();
		A1.login();
	}
}
