package locatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept
{
   static WebDriver driver;
	public static void main(String[] args) 
	{
		driver= new ChromeDriver();
		driver.get(" https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		By emailId=By.id("input-email");
		By pwd=By.id("input-password");
		
		ElementUtils eleUtils= new ElementUtils(driver);
		eleUtils.doSendKeys(emailId, "bargajeonkar99@gmail.com");
		eleUtils.doSendKeys(pwd, "Opencart@1234");
		

	}

}
