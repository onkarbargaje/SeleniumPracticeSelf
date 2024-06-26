package amz_test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import amz_DDT.Amazon_DDT;

public class Amz_Test_Launch_Quit extends Amazon_DDT
{
	public static WebDriver driver;
	
	@BeforeMethod
	void login()
	{
		driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
	
	@AfterMethod
	void CheckOut() throws IOException, InterruptedException
	{
		
		//TakesScreenshot ts= (TakesScreenshot)driver;
        //File source= ts.getScreenshotAs(OutputType.FILE);
        
        //File destination= new File("C:\\Users\\Onkar Bargaje\\eclipse-workspace\\seleniumPractice\\Screenshot\\onkar_\\"+ Math.random()+"Amazon.png");
        //FileUtils.copyFile(source, destination);
		//Thread.sleep(1000);
		//driver.quit();

}
}

