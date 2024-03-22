package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//launch goibibo page select from bnaglore and to delhi and
//select the first autosuggestions ,select any future date and
//select one adult click on search button.
public class Assignment_135 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;	
		driver = new ChromeDriver();		
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
	//	driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		Thread.sleep(1000);
		WebElement from =	driver.findElement(By.xpath("(//p[@class='sc-12foipm-20 bhnHeQ'])[1]"));
	
		from.click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hyderabad");
		 
		Thread.sleep(1000);
		WebElement from1 =	driver.findElement(By.xpath("(//div[@class='sc-12foipm-42 jfBwYt'])[1]"));
	 
		from1.click();
		
		
		
		Thread.sleep(1000);
		WebElement to =	driver.findElement(By.xpath("(//p[@class='sc-12foipm-20 bhnHeQ'])"));
	
	//	to.click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("srilanka");
		 
		Thread.sleep(1000);
		WebElement to1 =	driver.findElement(By.xpath("(//li[@class='sc-12foipm-41 ehhpAW'])[1]"));
	 
		to1.click();
		
		WebElement day = driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[1]"));
		day.click();
		
		WebElement done = driver.findElement(By.xpath("//span[@class='fswTrvl__done']"));
		done.click();
		
		WebElement fdone = driver.findElement(By.xpath("//a[@class='sc-12foipm-77 jYnAuG']"));
		fdone.click();
		
		WebElement search = driver.findElement(By.xpath("//span[@class='sc-12foipm-85 fUaVPB']"));
		search.click();
		
	}

}
