package seleniumassignments;
import org.openqa.selenium.By;
//Login to Facebook using id,name locator
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_112
{
	public static void main(String[] args) 
	{
		ChromeDriver driver =new ChromeDriver();		
		driver.manage().window().maximize();

		// by locator - id
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("testing256123");
		driver.findElement(By.id("pass")).sendKeys("testing123456");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("by locator id - login");
		
		// by locator - name
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys("testing256123");
		driver.findElement(By.name("pass")).sendKeys("testing123456");
		driver.findElement(By.name("login")).click();
		System.out.println("by locator name - login");
		
	}

}
