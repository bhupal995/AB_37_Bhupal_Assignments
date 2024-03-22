package seleniumassignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch www.flipkart.com page,search for books and 
//click on second autosuggestion use xpath to locate autosuggestions.
public class Assignment_127 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("books");
		
		List<WebElement>  results = driver.findElements(By.xpath("//form/ul/li"));
	
		Thread.sleep(2000);
		int count = results.size();
		Thread.sleep(2000);
		System.out.println(count);
		
		

	}

}
