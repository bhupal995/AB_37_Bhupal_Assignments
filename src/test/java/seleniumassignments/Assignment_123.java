package seleniumassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// Launch grotechminds registration form and locate dropdowns skills,country 
//and religion perform action on them
public class Assignment_123 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
	//dropdown using selectbyvalue
		WebElement skills_drop = driver.findElement(By.id("Skills"));		
		Select s1 =new Select(skills_drop);
		s1.selectByValue("select2");		
	// dropdown using selectbyvisibletext
		WebElement country_drop = driver.findElement(By.id("Country"));		
		Select s2 =new Select(country_drop);
		s2.selectByVisibleText("India ");	
	// dropdown using selectbyindex
		WebElement relegio_drop = driver.findElement(By.id("Relegion"));
		Select s3 =new Select(relegio_drop);
		s3.selectByIndex(1);
				
	}

}
