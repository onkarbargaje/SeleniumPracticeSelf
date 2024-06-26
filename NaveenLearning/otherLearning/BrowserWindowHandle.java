package otherLearning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {
  static WebDriver driver;
  
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement facebookEle=driver.findElement(By.xpath("(//a[contains(@href,'youtube') and @target='_blank'])[2]"));
		Thread.sleep(3000);
		facebookEle.click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		String parentWindowID=it.next();
		String childWindowID=it.next();
		System.out.println("Parent window ID "+ parentWindowID);
		System.out.println("Child window ID "+ childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		driver.close();
		driver.switchTo().window(parentWindowID);
		
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		

	}

}
