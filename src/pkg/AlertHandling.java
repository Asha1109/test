package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hp/Documents/alert12.html");
		
		
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
	}

}
