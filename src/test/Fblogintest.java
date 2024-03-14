package test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbloginpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void serturl()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		Fbloginpage fp=new Fbloginpage(driver);
		fp.setvalues("abc@gmail.com", "abcd");
		fp.login();
	}
	
	

}
