package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPagefactoryPage {
	WebDriver driver;
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpassword;
	@FindBy(name="login")
	WebElement fblogin;
	
	public FbloginPagefactoryPage(	WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvalues(String email,String Pssword)
	{
		fbemail.sendKeys(email);
		fbpassword.sendKeys(Pssword);
	}
	public void login()
	{
		fblogin.click();
	}

}
