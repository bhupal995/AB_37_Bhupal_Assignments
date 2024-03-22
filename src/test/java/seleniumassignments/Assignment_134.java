package seleniumassignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_134 {
// Launch amazon search for any product 
// and add to card and try to make debit/credit card method of payment
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;	
		driver = new ChromeDriver();		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(1000);
		WebElement book= driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		Thread.sleep(1000);
		book.click();
		Set<String> parent_child= 	 driver.getWindowHandles();
		System.out.println(parent_child);
		
		Iterator<String> pcid = parent_child.iterator();
		Thread.sleep(1000);
		String parent = pcid.next();
		String child = pcid.next();
		
		driver.switchTo().window(child);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		
		
	}

}
