package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit2 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void titleVerification()
	{
		String actual=driver.getTitle();
		String exp="Goole123";
		if(actual.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void pageSource()
	{
		String Src=driver.getPageSource();
		if(Src.contains("Gamil"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@After
	public void browserClose()
	{
	driver.close();
	//driver.quit();

}
}
