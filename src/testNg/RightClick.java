package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test()
	{
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(rightclick);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		driver.switchTo().alert().accept();
		/*Alert a=driver.switchTo().alert();
		String text=a.getText();
		if(text.equals("clicked: edit"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}*/
		//a.accept();
		
		WebElement doublec=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		
		
		act.doubleClick(doublec);
		act.perform();
		driver.switchTo().alert().accept();
		//Alert a=driver.switchTo().alert();
		/*String text1=a.getText();
		if(text1.equals("You double clicked me.. Thank You.."))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();*/
		
	}

}
