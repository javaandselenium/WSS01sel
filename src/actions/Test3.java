package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement ele2 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		


		Actions a=new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();

	}

}
