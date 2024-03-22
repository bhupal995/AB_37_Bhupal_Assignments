package seleniumassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//"Launch Growtechminds xpath form do the folllowing  1. Write an Xpath for books
//2. Write an Xpath for Mobiles
//3. Write an Xpath for Clothes
//4. Write an Xpath for Chocolates"
public class Assignment_124 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/x-path/#1");
		driver.findElement(By.xpath("//nav[@class='tree-nav default']/ul/li/span")).click();
		Thread.sleep(1000);
		
		// clicking on books
		driver.findElement(By.xpath("(//nav[@class='tree-nav default']/ul/li/ul/li/span)[1]")).click();
		Thread.sleep(1000);
		// clicking on mobiles
		driver.findElement(By.xpath("((//nav[@class='tree-nav default']/ul/li/ul/li)[2])/span")).click();
		// clicking on clothes
		driver.findElement(By.xpath("(//nav[@class='tree-nav default']/ul/li/ul/li)[3]/span")).click();		
		// clicking on choclates
		driver.findElement(By.xpath("(//nav[@class='tree-nav default']/ul/li/ul/li)[4]/span")).click();
		// clicking on bevarges
		driver.findElement(By.xpath("(//nav[@class='tree-nav default']/ul/li/ul/li)[5]/span")).click();
	}

}
