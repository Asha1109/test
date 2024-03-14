package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaAlert {
ChromeDriver driver;
@Before
public void set()
{
	driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
			
}
@Test
public void alert()
{
	driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
}
}
