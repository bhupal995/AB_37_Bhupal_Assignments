package seleniumassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Launch GrowTechminds registraion form,locate every element except Dropdowns and Upload file button 
// and perform action on each element using WebElement
public class Assignment_121 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
	
		WebElement fname =driver.findElement(By.id("fname"));
		WebElement lname = driver.findElement(By.id("lname"));
		WebElement uname = driver.findElement(By.id("Username"));
		WebElement  pass = driver.findElement(By.id("password"));
		WebElement  r_male = driver.findElement(By.id("Male"));
		WebElement  r_female = driver.findElement(By.id("FeMale"));
		WebElement  preaddres = driver.findElement(By.id("w3review"));
		WebElement  permeaddres = driver.findElement(By.id("Address"));
		WebElement  pincode = driver.findElement(By.id("Pincode"));
		
		fname.sendKeys("test00");
		lname.sendKeys("autom");
		uname.sendKeys("java");
		pass.sendKeys("test@12345");
		r_male.click();
		r_female.click();
		preaddres.sendKeys("Automation Testing");
		permeaddres.sendKeys("India");
		pincode.sendKeys("123456");
		
		
	}

}
