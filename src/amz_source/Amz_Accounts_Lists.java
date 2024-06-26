package amz_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Accounts_Lists 
{
	//navigate to 'Switch Account' in Acc and lists dropdown
	@FindBy(xpath="//span[contains(text(),'Switch Accounts')]")
	WebElement switch_accounts_dd;
	
	//on 'Switch Account' page click on the Add Account 
	@FindBy(xpath="(//div[.='Add account'])[3]")
	WebElement add_accounts_bt;
	public Amz_Accounts_Lists(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSwitchAccountsdd() 
	{
		
		switch_accounts_dd.click();
		add_accounts_bt.click();
		
	}


	

	
	

}
