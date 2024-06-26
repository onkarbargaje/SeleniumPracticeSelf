package locatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementNotPresentTest
{
   //NoSuchElementException will be thrown if element is not present or xpath is wrong for that element
	public static void main(String[] args) 
	{
		BrowserUtils broUtil = new BrowserUtils();
		WebDriver driver = broUtil.initDriver("chrome");
		broUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By logoImage = By.xpath("//img[@title='naveenopencart']");
		
		ElementUtils eleUtil = new ElementUtils(driver);
		boolean flag = eleUtil.doElementDisplayed(logoImage);
		System.out.println(flag);

	}

}
