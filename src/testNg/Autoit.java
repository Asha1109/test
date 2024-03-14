package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoit {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Runtime.getRuntime().exec("\"D:\\pdfauto123.exe\"");
		
		
	}

}
