package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderForAmazon 
{
	@Test (dataProvider="verifyLogin")
	public void verifyLogin(String userName, String pwd ) throws InterruptedException
	{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    WebElement hover=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
    Actions a1= new Actions(driver);
    a1.moveToElement(hover).perform();
    WebElement signIN=driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
    signIN.click();
    
    WebElement emailId=driver.findElement(By.id("ap_email"));
    emailId.sendKeys(userName);
    WebElement continue_bt=driver.findElement(By.id("continue"));
    continue_bt.click();
    
    WebElement password=driver.findElement(By.id("ap_password"));
    password.sendKeys(pwd);
    
    WebElement signIn_bt=driver.findElement(By.id("signInSubmit"));
    signIn_bt.click();
    
    Thread.sleep(2000);
	}
	
	@DataProvider(name="verifyLogin")
	
	public Object[][] loginData()
	{
		Object[][] data = new Object[2][2];
		data [0][0]= "8788628159";
		data [0][1]= "Testing@1234";
		
		data [1][0]= "8788628159";
		data [1][1]= "Testing@12345";
		return data;
	}

}
