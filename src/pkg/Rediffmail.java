package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("asha mathew");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("asha@123");

	}
	

}
