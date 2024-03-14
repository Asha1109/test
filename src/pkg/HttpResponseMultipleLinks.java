package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HttpResponseMultipleLinks {
	ChromeDriver driver;
	
	@Before 
	public void set()
	{
		driver=new ChromeDriver();
	
	}
	@Test
	public void linkcount() throws Exception
	{
      driver.get("https://www.google.com");
        List <WebElement> li=driver.findElements(By.tagName("a"));
        for(WebElement s:li)
        {
        	String links=s.getAttribute("href");
        	varify(links);
        }
	}
	public void varify(String links)  {
		try
		{
			
		
		URL ob=new URL(links);
		          HttpURLConnection con =(HttpURLConnection)ob.openConnection();
		          con.connect();
		          if(con.getResponseCode()==200) 
		          {
		        	  System.out.println("valid"+links);
		          }
		          else if(con.getResponseCode()==404)
		          {
		        	  System.out.println("broken links"+links);
		          }
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		          
		
		
	}

}
