package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.com/");
	     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     
	    WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	    if(ele.isDisplayed())
	    {
	    	ele.sendKeys("phone");
	    	System.out.println("Pass:element is dispalyed");
	    }
	    else
	    {
	    	System.out.println("Fail:element is not displayed");
	    }
	    
	    Thread.sleep(5000);
	    driver.close();
	}

}
