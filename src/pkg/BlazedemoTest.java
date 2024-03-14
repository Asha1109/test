package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazedemoTest {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.blazedemo.com/register");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("Asha");
		driver.findElement(By.name("company")).sendKeys("IBM");
		driver.findElement(By.name("email")).sendKeys("asha@123gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("password_confirmation")).sendKeys("1234");
		driver.findElement(By.className("btn btn-primary")).click();
	}

}
