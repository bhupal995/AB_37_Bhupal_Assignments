package seleniumassignments;
import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;
//Get the title of flipkart.com and save each word in an array
public class Assignment_111
{
	public static void main(String[] args)
	{
		ChromeDriver driver =new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title =	driver.getTitle();
		System.out.println(title);
		
		String[] a = title.split(" ");
		System.out.println(Arrays.toString(a));

	}

}
