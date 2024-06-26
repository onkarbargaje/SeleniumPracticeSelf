package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
	
	WebDriver driver;
	@Test 
	@Parameters("browser")
	public void diffBrowser(String nameOfBrowser)
	{
		if(nameOfBrowser.equalsIgnoreCase("Chrome"))
		{
			driver= new ChromeDriver();
		}
		if(nameOfBrowser.equalsIgnoreCase("Firefox"))
		{
			driver= new FirefoxDriver();
		}
          
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
        
	}

}
