package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlindElement {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Hp/Documents/alert12.html");
		
		
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		if(text.equals("Hello!I am an alert box!!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
	}

}
