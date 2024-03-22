package seleniumassignments;

import org.testng.annotations.Test;

// create a class which has 2 @test with priority as 1,and find out which one executes first
public class Assignment_143 
{

	@Test  (priority=1)
	public void abc_test()
	{
		System.out.println("Test One");		
	}
	
	@Test  (priority=0)
	public void bcd_test()
	{
		System.out.println("Test two");
	}



	
	
}
