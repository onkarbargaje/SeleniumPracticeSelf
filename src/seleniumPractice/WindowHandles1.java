package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 {
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{

		driver= new ChromeDriver();
	    driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement facebook=driver.findElement(By.xpath("//h3[contains(text(),'FACEBOOK')]"));
        WebElement twitter=driver.findElement(By.xpath("//h3[contains(text(),'TWITTER')]"));
        WebElement instagram=driver.findElement(By.xpath("//h3[contains(text(),'INSTAGRAM')]"));
        
        facebook.click();
        twitter.click();
        instagram.click();
        
        Thread.sleep(5000);
        
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parentWindowID=it.next();
        String facebookWindowID=it.next();
        String twitterWindowID=it.next();
        String instagramWindowID=it.next();
        String facebookWindowTitle= getChildWindowTitle(facebookWindowID);
        driver.close();
        String twitterWindowTitle=getChildWindowTitle(twitterWindowID);
        driver.close();
        String instagramWindowTitle=getChildWindowTitle(instagramWindowID);
        driver.close();
        
	}
	
	public static String getChildWindowTitle(String childWindowID)
	{
		driver.switchTo().window(childWindowID);
		String childWindowTitle=driver.getTitle();
		return childWindowTitle;
	}

}
