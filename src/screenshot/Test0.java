package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//typcasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		//access the method and photo is stored in RAM
		File src = ts.getScreenshotAs(OutputType.FILE);
		//specify the location
		File dest=new File("./photo/flipkart.png");
		//copypaste from ram to required location
		FileUtils.copyFile(src, dest);
		
		driver.close();
		
		
		


	}

}
