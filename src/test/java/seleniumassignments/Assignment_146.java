package seleniumassignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//write testNG classes for the following 
//1.login to amazon 2.search for a pen
//3.select anyone from the search result 4.add ro wishlist 5.logout
public class Assignment_146
{

	@Test
	public void login_to_amazon_search_logout() throws InterruptedException
	{
	
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.amazon.in");
	driver.navigate().refresh();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement sign_in = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	sign_in.click();								

	WebElement email_txtfield  = driver.findElement(By.id("ap_email"));
	email_txtfield.sendKeys("XXXXXXX");
	
	WebElement continue_btn = driver.findElement(By.id("continue"));
	continue_btn.click();
	
	WebElement passwrd = driver.findElement(By.id("ap_password"));
	passwrd.sendKeys("XXXXXX");
	
	
	WebElement sign_btn = driver.findElement(By.id("signInSubmit"));
	sign_btn.click();
	

	
	WebElement search_bar = driver.findElement(By.id("twotabsearchtextbox"));
	search_bar.sendKeys("pen");
	search_bar.sendKeys(Keys.ENTER);
	
	
	WebElement first_product = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
	first_product.click();
	
	
	String parentid= driver.getWindowHandle();
	Set<String> paren_childid = driver.getWindowHandles();
	
	System.out.println(parentid);
	System.out.println(paren_childid);
	
	Iterator<String> pcid  = paren_childid.iterator();
	String paretn1 = pcid.next();
	String child1 = pcid.next();
	
	driver.switchTo().window(child1); 
	
	WebElement wishlist = driver.findElement(By.id("add-to-wishlist-button-submit"));
	wishlist.click();
	
	Thread.sleep(5000);
	
	
	WebElement cont_shp =  driver.findElement(By.xpath("(//span[.='Continue shopping'])[3]"));
	cont_shp.click();
	WebElement hello = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
	Actions a1 =new Actions(driver);
	a1.moveToElement(hello).perform();
	hello.click();
	
	Thread.sleep(1000);
	WebElement signout = driver.findElement(By.id("nav-item-signout"));
	signout.click();
	//a1.moveToElement(signout).perform();
	
	driver.quit();
	
	}
	
	
	
}
