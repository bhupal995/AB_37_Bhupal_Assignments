package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 
{

	public static void main(String[] args)
	{
		ChromeDriver d1 =new ChromeDriver();
		d1.get("https://grotechminds.com/registration/");
		
		d1.findElement(By.id("Username")).sendKeys("Reddy Bhupal");

	}

}
