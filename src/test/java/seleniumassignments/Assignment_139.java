package seleniumassignments;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//write a testNG code which has BM,AM,two  @test
public class Assignment_139
{

	

		@BeforeMethod
		public void beforemethod()
		{
		System.out.println("Before method");
		}
		
		
		@Test
		public void test()
		{
			System.out.println("Main test");
		}	
		
		
		@Test
		public void test_two()
		{
			System.out.println("Test two");
		}	
		
			
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("After method");
		}
		
		

	
	
	
	
}
