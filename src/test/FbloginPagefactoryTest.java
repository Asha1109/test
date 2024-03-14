package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FbloginPagefactoryPage;

public class FbloginPagefactoryTest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		FbloginPagefactoryPage fp=new FbloginPagefactoryPage (driver);
		fp.setvalues("abc@gmail.com", "abc123");
		fp.login();
	}

}
