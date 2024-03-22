package seleniumassignments;
import org.openqa.selenium.By;
//Login to facebook.com using xpath locator(Relative xpath)
import org.openqa.selenium.chrome.ChromeDriver;

	public class Assignment_118 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");		
		
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("tester45870");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("testerautomation85697");
		driver.findElement(By.xpath("(//button)[1]")).click();
		
	}

}
