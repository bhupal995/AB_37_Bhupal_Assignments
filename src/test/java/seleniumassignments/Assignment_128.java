package seleniumassignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_128 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	WebElement search =	driver.findElement(By.id("twotabsearchtextbox"));
	WebElement click = driver.findElement(By.id("nav-search-submit-button"));
	
	search.sendKeys("shoes");
	click.click();
		
	WebElement shoe_1 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[30]"));
	
	shoe_1.click();
	
	String parentid= driver.getWindowHandle();
	Set<String> paren_childid = driver.getWindowHandles();
	
	System.out.println(parentid);
	System.out.println(paren_childid);
	
	Iterator<String> pcid  = paren_childid.iterator();
	String paretn1 = pcid.next();
	String child1 = pcid.next();
	
	driver.switchTo().window(child1);
	
	WebElement addcart = driver.findElement(By.id("add-to-cart-button"));
	addcart.click();
	
	
		
		
		

	}

}
