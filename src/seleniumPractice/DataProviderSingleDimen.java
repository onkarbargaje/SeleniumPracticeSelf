package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DataProviderSingleDimen 
{
	@Ignore
	@Test (dataProvider="verifyLogin")
	public void verifyLogin(String s ) throws InterruptedException
	{
	   System.out.println(s);
	}
	
	@DataProvider(name="verifyLogin")
	
	public Object[] loginData()
	{
		String[] data = new String[2];
		data [0]= "8788628159";
		data [1]= "Testing@1234";
		
		return data;
	}
	////Method 2.1
	@Test (dataProvider="verifyLogin2")
	public void verifyLogin(String[] s ) throws InterruptedException
	{
	   System.out.println(s[0]+" >> "+ s[1]);
	}
	
	@DataProvider(name="verifyLogin2")
	
	public String[][] loginData2()
	{
		String[] []data = new String[][] {
			{"abc", "123"},
			{"cde", "456"},
			{"pqqr", "789"},
			
		};
		
		
		return data;
	}
	
////Method 2.2
	@Test (dataProvider="verifyLogin3")
	public void verifyLogin(String username, String password ) throws InterruptedException
	{
	   //System.out.println(s[0]+" >> "+ s[1]);
	   System.out.println(username+" >> "+password);
	}
	
	@DataProvider(name="verifyLogin3")
	
	public String[][] loginData3()
	{
		String[] []data = new String[][] {
			{"abc", "123"},
			{"cde", "456"},
			{"pqqr", "789"},
			
		};
		
		
		return data;
	}

////Method 2.3 for jaggedArray where column count is not fixed in row
	
	// if we do not know the how many column present in row in this case we always mention
	// Single dimension array in the parameter
	@Test (dataProvider="verifyLogin4")
	public void verifyLogin1(String[] s ) throws InterruptedException
	{
           for (int i=0;i<s.length; i++)
           {
        	   System.out.println(s[i]);
           }
           System.out.println(">>>>>");
            
	}
	
	@DataProvider(name="verifyLogin4")
	
	public String[][] loginData4()
	{
		String[] []data = new String[][] {
			{"abc", "123", "1090", "!@309"},
			{"cde", "456", "vnks"},
			{"pqqr", "789"},
			
		};
		
		
		return data;
	}

}
