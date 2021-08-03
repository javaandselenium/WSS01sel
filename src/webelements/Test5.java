package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.com/");
	     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     
	     
	     WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	     System.out.println(ele.getAttribute("type"));
	     
	     driver.close();
	     

	}

}
