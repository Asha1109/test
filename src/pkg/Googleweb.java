package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googleweb {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();//get drive
		driver.get("http://www.google.com");
		//driver.get("http://www.facebook.com");
		String actualTitle=driver.getTitle();
		//System.out.println(actualTitle);
		String expectedTitle="Google123";
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
