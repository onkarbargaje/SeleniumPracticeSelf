package amz_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz_DDT.Amazon_DDT;
import amz_test.Amz_Test_Launch_Quit;

public class Amz_Login_UserName extends Amazon_DDT
{
	//public WebDriver driver;
	//@FindBy(xpath="//input[@type='email']")
	@FindBy(id="ap_email")
	WebElement email;
	
	
	//@FindBy(xpath="//input[@id='continue']")
	@FindBy(id="continue")
	WebElement Continue;
	
	public Amz_Login_UserName(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void un()
	{
		email.sendKeys(unameExcelData);
		
	}
	
	public void Continue()
	{
		Continue.click();
	}
	
	
}
