package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fbpage;
import utilities.Exelutil;

public class Fbtest extends Baseclass {
	@Test
	public void verifyLoginWithValidCard()
	{
		Fbpage p1=new Fbpage(driver);
		//Reading the data from excel file by the specified path
		
		String x1="D:\\facebook.xlsx";
		
				String Sheet="Sheet1";
				int rowCount=Exelutil.getRowCount(x1,Sheet);
				for(int i=1;i<=rowCount;i++)
				{
					String Username=Exelutil.getCellValue(x1, Sheet, i, 0);
					System.out.println("Username-----------"+Username);
					String pwd=Exelutil.getCellValue(x1, Sheet, i, 1);
					System.out.println("password-------"+pwd);
					
					  //Pssing Username and Password as parameters
					
					//Submitting the data by clicking on login button
					//p1.setvalues("","");
					
					p1.setvales(Username, pwd);
					p1.login();
				}
	}
	

}
