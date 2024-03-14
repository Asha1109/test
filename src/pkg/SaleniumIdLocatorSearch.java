package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleniumIdLocatorSearch {
 ChromeDriver driver;
 @Before
 public void setup()
 {
	 driver=new ChromeDriver();
	 driver.get("http://www.facebook.com");
 }
 @Test
 public void test()
 {
	 driver.findElement(By.id("email")).sendKeys("9656082403");
	 driver.findElement(By.id("pass")).sendKeys("Mathewkc");
	 driver.findElement(By.name("login")).click();
 }
}
