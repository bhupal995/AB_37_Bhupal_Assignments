package seleniumassignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//create a class add 4 @test in one @test add invocationCount=11
//find out number of test cases executed add AM and BM to it

public class Assignment_142
{

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}
	
	@BeforeMethod()
	public void beforemethod()
	{
		System.out.println("Before method");
	}
	
	@Test
	public void test_one()
	{
		System.out.println("Test One");		
	}
	
	@Test  (invocationCount=11)
	public void test_two()
	{
		System.out.println("Test two");
	}
	
	@Test
	public void test_three()
	{
		System.out.println("Test three");
	}
		
	@Test
	public void test_four()
	{
		System.out.println("Test four");
	}
	
	
}
