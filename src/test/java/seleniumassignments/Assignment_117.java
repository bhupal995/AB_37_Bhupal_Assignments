package seleniumassignments;
import org.openqa.selenium.By;
//Launch HTML page get elements by xpath(absolute xpath)
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_117 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:/C:/Users/bhupa/Downloads/learningHTML1.html");
		
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("tester");
		
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("tester123");
		
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("tester@#123");
		
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("name");
		
	//	driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
		
		driver.findElement(By.xpath("(/html/body/form/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/form/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/form/input)[6]")).click();
		
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		
	}

}
