package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args)  {
	WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.instagram.com/accounts/login/");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

 driver.findElement(By.name("username")).sendKeys("Qspiders");
 driver.findElement(By.name("password")).sendKeys("selenium");
 driver.findElement(By.xpath("//div[text()='Log In']")).click();
 
 String title = driver.getTitle();
 System.out.println(title);
 
 String url = driver.getCurrentUrl();
 System.out.println(url);
 
 if(title.equals("Login • Instagram")) {
	 System.out.println("Pass: Login page is dispalyed");
 }
 else
 {
	 System.out.println("Fail:login page is not dispalyed");
 }

 driver.close();
 
	}

}
