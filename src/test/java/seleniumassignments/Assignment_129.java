package seleniumassignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_129 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		
		String pagetitle= driver.getTitle();
		
		System.out.println(pagetitle);


	}

}
