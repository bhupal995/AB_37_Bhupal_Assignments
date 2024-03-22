package seleniumassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
// "Perform any action on the disabled component
// and find out which exceeption we are getting"
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_125 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/learningHTML1.html");
		WebElement l_name = driver.findElement(By.id("121"));
		l_name.sendKeys("reddy");
		

	}

}
