package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='gb_C']")).click();
		
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//span[text()='Calendar']")).click();
		


		
		driver.findElement(By.id("identifierId")).sendKeys("phone");
		
		driver.switchTo().defaultContent();
		
	}

}
