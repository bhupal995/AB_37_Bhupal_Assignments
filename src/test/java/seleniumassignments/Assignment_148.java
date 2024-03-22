package seleniumassignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//write testNG classes for the following 1.login to amazon 
//2.open dropdown beside search textfiled 3.select books and search for any book 4.logout
public class Assignment_148 
{

	@Test
	public void login_to_amazon_search_book_logout() throws InterruptedException
	{
	
		WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in");			// launch amazon
	driver.navigate().refresh();
	driver.manage().window().maximize();
	
	WebElement sign_in = driver.findElement(By.id("nav-link-accountList-nav-line-1"));   // signing in to amazon
	sign_in.click();								

	WebElement email_txtfield  = driver.findElement(By.id("ap_email"));
	email_txtfield.sendKeys("XXXXX");
	
	WebElement continue_btn = driver.findElement(By.id("continue"));
	continue_btn.click();
	
	WebElement passwrd = driver.findElement(By.id("ap_password"));
	passwrd.sendKeys("XXXXXX");
	
	
	WebElement sign_btn = driver.findElement(By.id("signInSubmit"));
	sign_btn.click();
	
	Thread.sleep(1000);													// selecting books dropdown
	
	Select se = new Select(driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")));
	
	se.selectByVisibleText("Books");
	
	WebElement search_bar = driver.findElement(By.id("twotabsearchtextbox"));		// searching automation testing
	search_bar.sendKeys("automation testing");
	search_bar.sendKeys(Keys.ENTER);
	
	
	WebElement first_product = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	first_product.click();																				
																		// clicking on first product
	
	
	String parentid= driver.getWindowHandle();
	Set<String> paren_childid = driver.getWindowHandles();
	
	System.out.println(parentid);
	System.out.println(paren_childid);
	
	Iterator<String> pcid  = paren_childid.iterator();
	String paretn1 = pcid.next();
	String child1 = pcid.next();
	
	driver.switchTo().window(child1); 
	
	
	WebElement hello = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
	Actions a1 =new Actions(driver);
	a1.moveToElement(hello).perform();
	
	Thread.sleep(1000);
	WebElement signout = driver.findElement(By.id("nav-item-signout"));
	signout.click();
	
	
	driver.quit();
	
	
	}
	
	
	
}
