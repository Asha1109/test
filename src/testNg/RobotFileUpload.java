package testNg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RobotFileUpload {
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
		fileUpload("\"C:\\Users\\Hp\\Documents\\TESTI NG_ASHA_RESUME.pdf\"");
		
	}
	public void fileUpload(String p) throws AWTException  {
		//to copy path to clipboard
		StringSelection StrSelection =new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(StrSelection, null);
		//to paste into symwidow
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
	

}
