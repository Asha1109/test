package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="Facebook123";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
