package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleniumInstagram {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.instagram.com");
		
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("username")).sendKeys("Asha Mathew");
		driver.findElement(By.name("password")).sendKeys("asha@2000",Keys.ENTER);
		
	}

}
