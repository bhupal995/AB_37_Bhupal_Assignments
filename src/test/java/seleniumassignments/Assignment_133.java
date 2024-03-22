package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

// Launch amazon.in and print all the option names present in " All" dropdowns 
public class Assignment_133
{

	public static void main(String[] args) 
	{
		WebDriver driver;	
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		
		String text = all.getText();
		System.out.println(text);	

	}

}
