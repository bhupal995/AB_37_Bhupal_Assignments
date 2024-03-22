package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Launch growtechminds drag and drop page,
// do drag a image and drop it in target place,do the reverse of it.
public class Assignment_132 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement d1 = driver.findElement(By.id("drag1"));		
		WebElement d2 = driver.findElement(By.id("div2"));
		WebElement d3 = driver.findElement(By.id("div1"));
		
		Actions a1 =new Actions(driver);
		Thread.sleep(1000);
		a1.dragAndDrop(d1, d2).perform();
		Thread.sleep(1000);
		a1.dragAndDrop(d1, d3).perform();	
		
		

	}

}
