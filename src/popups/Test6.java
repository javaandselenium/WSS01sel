package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		System.out.println(child.size());
		
		String expTitle="Tech Mahindra";
		
		for(String allwin:child) {
			driver.switchTo().window(allwin);
			String acttitle = driver.getTitle();
			System.out.println(acttitle);
			
			if(acttitle.equals(expTitle))
			{
				driver.close();
				}
			}

	}

}
