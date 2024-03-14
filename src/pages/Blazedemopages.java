package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemopages {
	WebDriver driver;
	By Rename=By.id("name");
	By Recompany=By.id("company");
	By Reemail=By.id("email");
	By Repassword=By.id("password");
	By Recpassword=By.id("password-confirm");
	By Register=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	By login=By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a");
	By emailAdd=By.id("email");
	By lpassword=By.id("password");
	By rem=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[3]/div/div/label/input");
	By llogin=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
	public Blazedemopages(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setReg(String name,String company,String email,String password,String conformpass)
	{
		driver.findElement(Rename).sendKeys(name);
		driver.findElement(Recompany).sendKeys(company);
		driver.findElement(Reemail).sendKeys(email);
		driver.findElement(Repassword).sendKeys(password);
		driver.findElement(Recpassword).sendKeys(conformpass);
		
	}
	public void register()
	{
		driver.findElement(Register).click();;
	}

}
