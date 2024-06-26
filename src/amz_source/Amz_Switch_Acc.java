package amz_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Switch_Acc 
{
	//click on the Add Account on the Switch account page
	@FindBy(xpath="(//div[.='Add account'])[3]")
	WebElement addAccount_bt;
	
	public Amz_Switch_Acc (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnAddAccountbt()
	{
		addAccount_bt.click();
	}

}
