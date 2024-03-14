package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Fbpage {
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	public Fbpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvales(String email,String pass)
	{
		driver.findElement(fbemail).clear();
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).clear();
		driver.findElement(fbpassword).sendKeys(pass);
	}
	public void login()
	{
		driver.findElement(fblogin).sendKeys(Keys.ENTER);;
	}

}
