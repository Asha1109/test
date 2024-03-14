package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageVarification {

	public static void main(String[] args) {
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://www.google.com");
		String src=Driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
