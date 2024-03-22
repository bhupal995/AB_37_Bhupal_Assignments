package seleniumassignments;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//write a testNG code which has BS,BT,BC ,BM and one @test
public class Assignment_137 
{

	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}

	@Test
	public void test()
	{
		System.out.println("Main test");
	}
	
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method");
	}
	
	
	
}
