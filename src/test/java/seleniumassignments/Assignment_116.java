package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_116 {

	public static void main(String[] args) throws InterruptedException {

ChromeDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		String[] name= new String[3];
		name[0]="Arab";
		name[1]="Kingdom";
		name[2]="States";
		
		for(int i=0;i<name.length;i++)
		{	
			driver.get("https://www.amazon.in/");
			driver.findElement(By.partialLinkText(name[i])).click();
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			
		}

	}

}
