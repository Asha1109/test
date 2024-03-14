package testNg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandling {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void window() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set <String> allwindow= driver.getWindowHandles();
		for(String handle:allwindow)
		{
			if(!handle.equalsIgnoreCase(parent))
			{
				driver.switchTo().window(handle);
				
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("asha@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
				
				driver.switchTo().window(parent);
				
			}
			
			
		}
		
		WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
		driver1.get("http://www.google.com");
		//WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
		
	}
	
	
}
