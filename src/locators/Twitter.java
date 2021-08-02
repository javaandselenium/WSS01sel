package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://twitter.com/");
		 Thread.sleep(9000);
		 driver.findElement(By.xpath("(//div[@dir='auto'])[4]")).click();
           
		
		 
	}

}
