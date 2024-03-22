package seleniumassignments;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//write testNG classes for the following 1.login to amazon 2.search for a shoe  
public class Assignment_144 
{

	@Test
	public void login_to_amazon()
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		WebElement sign_in = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		sign_in.click();
	
		WebElement email_txtfield  = driver.findElement(By.id("ap_email"));
		Assert.assertTrue(email_txtfield.isDisplayed());
		Assert.assertTrue(email_txtfield.isEnabled());
		email_txtfield.sendKeys("xxxxxxxx");
		
		WebElement continue_btn = driver.findElement(By.id("continue"));
		Assert.assertTrue(continue_btn.isDisplayed());
		Assert.assertTrue(continue_btn.isEnabled());
		continue_btn.click();
		
		WebElement passwrd = driver.findElement(By.id("ap_password"));
		Assert.assertTrue(passwrd.isDisplayed());
		Assert.assertTrue(passwrd.isEnabled());
		passwrd.sendKeys("xxxxxxx");
		
		WebElement sign_btn = driver.findElement(By.id("signInSubmit"));
		Assert.assertTrue(sign_btn.isDisplayed());
		Assert.assertTrue(sign_btn.isEnabled());
		sign_btn.click();
		
		
		WebElement search_bar = driver.findElement(By.id("twotabsearchtextbox"));
		search_bar.sendKeys("shoe");
		search_bar.sendKeys(Keys.ENTER);
	}
	
}
