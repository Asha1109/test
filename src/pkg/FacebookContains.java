package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookContains {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("asha0011km");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
		
	}
}
