package waitConcept;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFindElements {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		
		By locator= By.xpath("//div[text()='Company']/parent::div//li");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> companyFooterList=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		System.out.println(companyFooterList.size());
		
	}
	
	public static List<WebElement> waitForPresenceOFAllElements(By locator, int time)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		//System.out.println(companyFooterList.size());
	}

}
