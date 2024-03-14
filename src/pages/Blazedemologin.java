package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemologin {
	WebDriver driver;
	By login=By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a");
	By emailAdd=By.id("email");
	By lpassword=By.id("password");
	By rem=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[3]/div/div/label/input");
	By llogin=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	public Blazedemologin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String password)
	{
		driver.findElement(login).click();
		driver.findElement(emailAdd).sendKeys(email);
		driver.findElement(lpassword).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(rem).click();
		driver.findElement(llogin).click();
	}

}
