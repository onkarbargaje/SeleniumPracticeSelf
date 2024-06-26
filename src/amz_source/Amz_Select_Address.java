package amz_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Select_Address 
{
	@FindBy(xpath="(//input[@name='submissionURL'])[1]")
	WebElement address_radio_bt;
	
	
	@FindBy(xpath="//input[@data-testid='Address_selectShipToThisAddress']")
	WebElement use_this_address_bt;
	
	public Amz_Select_Address (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void address_select()
	{
		address_radio_bt.click();
	}
	
	public void address_confirm()
	{
		use_this_address_bt.click();
	}

}
