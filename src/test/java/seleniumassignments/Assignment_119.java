package seleniumassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//launch amazon.in select category dropdown,select Books using arrow down key then search for software in search text field and press enter using keys function.
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_119 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("(//select)[1]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//select)[1]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//select)[1]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//select)[1]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//select)[1]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//select)[1]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//select)[1]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//select)[1]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//select)[1]")).sendKeys(Keys.ARROW_DOWN);
	
		
	
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("software");
		driver.findElement(By.xpath("(//input)[6]")).click();

	}

}
