package locatorStrategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils 
{
	private WebDriver driver;
	
	public WebDriver initDriver(String browserName)
	{
		//String browserName="chrome";
		
		switch (browserName) {
		case ("chrome"):
			driver= new ChromeDriver();
			break;
		case ("firefox"):
			driver= new FirefoxDriver();
		    break;
			
		default:
			System.out.println("plz pass the right browser..." + browserName);
		
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
		
		
		
		
	}
	
	public void launchURL(String url) {
		driver.get(url);
	}

}
