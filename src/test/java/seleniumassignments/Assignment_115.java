package seleniumassignments;
import org.openqa.selenium.By;
//Launch Google.com and click on gmail using linkText.
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_115 {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("gmail link clicked");
	}

}
