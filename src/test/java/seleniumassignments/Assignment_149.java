package seleniumassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Scroll down on youtube for infinite times
public class Assignment_149 
{
	
	@Test
	public void youtube_scrolldown()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.in");			// launch amazon
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		
		
		
		
	}
	
	

}
