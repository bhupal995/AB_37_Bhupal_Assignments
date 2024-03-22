package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch Amazon and click on mobile tab.
public class Assignment_114 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Mobiles")).click();
	}

}
