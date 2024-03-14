package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Blazedemologin;
import pages.Blazedemopages;

public class Blazedemotest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new  ChromeDriver();
		driver.get("https://blazedemo.com/register");
		
	}
	@Test
	public void test()
	{
		Blazedemopages bl=new Blazedemopages(driver);
		bl.setReg("arya", "infosyss", "arya@gmail.com", "arayaoo", "aryaoo");
		bl.register();
		driver.navigate().back();
		Blazedemologin ba=new Blazedemologin(driver);
		ba.setvalues("arya@gmail.com", "aryaoo");
		ba.login();
	}
	

}
