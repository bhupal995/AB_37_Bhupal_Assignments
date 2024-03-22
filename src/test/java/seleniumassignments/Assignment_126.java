package seleniumassignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// "Count the number of links we have in a web page,locate using tagname"
public class Assignment_126 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://grotechminds.com/registration/");
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
	List<WebElement> links =	driver.findElements(By.tagName("a"));
	Thread.sleep(5000);
	int count =links.size();
	
	System.out.println(count);
	
	
	}

}
