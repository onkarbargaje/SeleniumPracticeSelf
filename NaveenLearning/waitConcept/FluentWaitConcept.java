package waitConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		
		
	Wait<WebDriver> wait	= new FluentWait<WebDriver>(driver)
			                  .withTimeout(null)
			                  
	

	}

}
