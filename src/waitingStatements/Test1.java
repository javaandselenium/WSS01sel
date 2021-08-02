package waitingStatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/accounts/login/");

		 WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
		 
		WebElement ele = driver.findElement(By.name("username"));
		 wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys("fhgg");

		driver.findElement(By.name("password")).sendKeys("selenium");
		 
		
		WebElement button = driver.findElement(By.xpath("//div[text()='Log In']"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click(); 
		
		
		
		 String title = driver.getTitle();
		 wait.until(ExpectedConditions.titleContains("Login • Instagram"));
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
