package testNg;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkAmazon {
	ChromeDriver driver;
	@BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
	 }
	 @BeforeMethod
	 public void urlload()
	 {
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
	 }
            @Test
	 public void test() throws Exception
	 {
		 
		 String parent= driver.getWindowHandle();
		 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phone",Keys.ENTER);
		 String s= driver.getTitle();
		//	System.out.println(“Title—” +s);
			if(s.equals("Amazon.in : mobile phones"))
			{
			    System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}

		
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		 Set<String> child = driver.getWindowHandles();
		 for(String handle:child)
		 {
			 if(!handle.equalsIgnoreCase(parent))
			 {
				 driver.switchTo().window(handle);
				 JavascriptExecutor js=(JavascriptExecutor) driver;
				 js.executeScript("window.scrollBy(0,700)", "");
				 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				Thread.sleep(5000);
				 driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();
		}
	 }
	 }
}
	/*WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test() throws Exception
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String mobile=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones",Keys.ENTER);
		String s=driver.getTitle();
		if(s.equals("amazon.in"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		
	
		Set <String> allwindows=driver.getWindowHandles();
		
		for(String handle:allwindows)
		{
			if(!handle.equalsIgnoreCase(mobile))
			{
				
				driver.switchTo().window(handle);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,700)", "By.name(\"submit.add-to-cart\")");
				
				//js.executeScript("arguments[0].scrollIntoView();","By.xpath(\"/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input\")");
				Thread.sleep(700);
				
				WebElement c=driver.findElement(By.name("submit.add-to-cart"));
				Thread.sleep(100);
				c.click();
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				driver.close();
				
				driver.switchTo().window(mobile);
				
			}
		}
			
		
	}*/
	

