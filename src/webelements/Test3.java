package webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {

		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.myntra.com/");
	     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     
	    WebElement ele = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	    Dimension s = ele.getSize();
             
	    int h = s.getHeight();
        System.out.println("height of the element "+h);
              int w = s.getWidth();
              System.out.println("width of the element "+w);
driver.close();              

	}

}
