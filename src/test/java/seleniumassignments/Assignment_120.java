package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

// Launch GrowTechminds registraion form,for firstname textfield enter name as Manish Kumar Tiwari,
// remove Tiwari from it using Keys option
public class Assignment_120 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("fname")).sendKeys(Keys.BACK_SPACE);
	}

}
