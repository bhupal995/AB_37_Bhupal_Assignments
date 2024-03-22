package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_131
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		
		Thread.sleep(2000);
		
		WebElement fashons= driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(fashons).perform();
		
	}

}
