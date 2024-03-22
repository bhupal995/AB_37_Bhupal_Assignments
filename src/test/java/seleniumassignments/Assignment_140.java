package seleniumassignments;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//write a testNG code which has three @test and a single BM 
public class Assignment_140 
{


	@BeforeMethod
	public void beforemethod()
	{
	System.out.println("Before method");
	}
	
	
	@Test		// Test -1
	public void test()
	{
		System.out.println("Main test");
	}	
	
	
	@Test   // Test -2
	public void test_two()
	{
		System.out.println("Test two");
	}	
	
		
	@Test   // Test -3
	public void anothertest()
	{
		System.out.println("One more test");
	}
	
}
