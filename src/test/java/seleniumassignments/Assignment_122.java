package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Launch GrowTechminds registration form,Enter "Manish Kumar Tiwari" in the firstname
//and copy paste in all 4 text fields using keys
public class Assignment_122 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		WebElement fname =driver.findElement(By.id("fname"));
		WebElement lname = driver.findElement(By.id("lname"));
		WebElement uname = driver.findElement(By.id("Username"));
		WebElement  pass = driver.findElement(By.id("password"));
		
		fname.sendKeys("test00");
	//	fname.sendKeys(Keys.ADD.)
		
		

	}

}
