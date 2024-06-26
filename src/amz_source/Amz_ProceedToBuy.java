package amz_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz_test.Amz_Test_Launch_Quit;

public class Amz_ProceedToBuy 
{
	//@FindBy(xpath="//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")
	//WebElement pToBuy_bt;
	
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement pToBuy_bt;
	
	public Amz_ProceedToBuy (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ProceedToBuy()
	{
		pToBuy_bt.click();
	}
	

}
