package amz_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz_DDT.Amazon_DDT;
import amz_test.Amz_Test_Launch_Quit;

public class Amz_Login_Paswword  extends Amazon_DDT
{
	//WebDriver driver;
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signIN_button;
	
	public Amz_Login_Paswword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	
	
	public void Password()
	{
		password.sendKeys(upasswordExcelData);
	}
	
	public void SignIn()
	{
		signIN_button.click();
	}

}
