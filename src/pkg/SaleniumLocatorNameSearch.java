package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleniumLocatorNameSearch {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void test()
	{
		//driver.findElement(By.name("q")).sendKeys("salenium");
		driver.findElement(By.name("q")).sendKeys("salenium",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
	}

}
