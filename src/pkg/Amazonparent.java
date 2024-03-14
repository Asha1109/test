package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonparent {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
	}

	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id='nav-main']//a[5]")).click();
	}
}
