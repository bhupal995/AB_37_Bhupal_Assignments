package seleniumassignments;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//write a testnNG code which has BS,AS,BM,BC,AC and one @test
public class Assignment_138
{

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method");
	}

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	
	

	@Test
	public void test()
	{
		System.out.println("Main test");
	}
	
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After suite");
	}
	
}
