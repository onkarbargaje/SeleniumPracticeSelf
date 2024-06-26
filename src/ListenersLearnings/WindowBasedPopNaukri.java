package ListenersLearnings;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.compress.archivers.Lister;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

@Listeners(ITestListenersLearn.class)
public class WindowBasedPopNaukri {

	@Test 
	public  void NaukariPopUp() throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement signIn=driver.findElement(By.linkText("Sign in with Google"));
		signIn.click();
		System.out.println(driver.getWindowHandle());
		Set<String> ids=driver.getWindowHandles();
		System.out.println(ids);
	    
		Iterator<String> p1=ids.iterator();
		String parentID=p1.next();  //will give parent id	
		System.out.println("Parent ID of window is "+ parentID);
		String childID=p1.next();    //will give child window id
		
		System.out.println("Child ID of window is "+childID);
		driver.switchTo().window(childID);
		
		WebElement createAccount=driver.findElement(By.xpath("//span[contains(text(),'Create account')]"));
		createAccount.click();
		Thread.sleep(2000);
		driver.close();
	}

}
