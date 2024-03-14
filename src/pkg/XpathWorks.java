package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWorks {
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
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("asha@gamil.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentGrid_741947\"]/div/div[2]/div[5]/div/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
	}

}
