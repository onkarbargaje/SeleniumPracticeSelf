package amz_source;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_Payment 
{
	public WebElement enterCardNumber_tf1;
	//WebDriver driver = new ChromeDriver();
	// click on cash on delivery payment option scenario 1
	@FindBy(xpath="(//span[.='Cash on Delivery/Pay on Delivery'])[3]")
    WebElement cod_payment_option_rbt;
	
	//click on credit debit card radio button
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
    WebElement payment2_option_rbt;
	
	
	
	//click on + icon after selecting the credit debit card payment option
	@FindBy(xpath="(//img[@class='apx-add-pm-trigger-common-image'])[1]")
	WebElement plusIconCardDetails;
	
	//click on Enter card details after selecting the credit debit card payment option
		@FindBy(linkText="Enter card details")
		WebElement enterCardDetails_link;
		
	//check Enter card details popup is visible or not
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	WebElement enterCardDetails_Popup;
	
	// enter the credit card number
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	//@FindBy(xpath="(//div[@class='a-popover-wrapper']//button)[1]")
	WebElement enterCardNumber_tf;
	
	//enter the name in the enter card details popup
	@FindBy(xpath="//div[@class='a-column a-span8 pmts-customer-card-name-input-box a-span-last']/input")
	WebElement enterNickName_tf;
	
	//close the enter card details popup after adding the details
		@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
		WebElement enterCardDetails_bt;
	
	//click on NetBanking radio button
			@FindBy(xpath="(//span[.='Net Banking'])[1]")
		    WebElement netBanking_rbt;
			
	//click on NetBanking option dropdown 
			@FindBy(xpath="(//span[.='Choose an Option'])[1]")
		    WebElement netBanking_dd;		
	// select the bank for net banking from dropdown
			@FindBy(xpath="//li[@role='option']")
			List<WebElement> netBankingOptions_dd;
	
	// click on Use this Payment method after selecting payment option
			@FindBy(xpath="(//span[.='Use this payment method'])[1]")
			WebElement useThisPaymentMethod_bt;	
			
			//click on UPI radio button
			@FindBy(xpath="//div[@aria-label ='Other UPI Apps']")
		    WebElement upi_rbt;
			
			//enter the UPI id
			@FindBy(xpath="//input[@placeholder ='Enter UPI ID']")
		    WebElement enterUpiId_tf;
			
			//enter the UPI id
			@FindBy(xpath="//span[@class='a-button a-button-primary']")
		    WebElement clickOnVerify_bt;

			// click Verify button after entering the UPI ID
						@FindBy(xpath="(//div[.='Please enter a valid UPI ID'])[3]")
						WebElement errorMessageAfterClickOnVerify;				
	
	public Amz_Payment(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void select_payment_method()
	{
		if(cod_payment_option_rbt.isEnabled())
		{
		cod_payment_option_rbt.click();
		
	    }
		else
		{
			System.out.println("Cash On Delivery is not available for this ");
		}
	}
	public void select_payment_method_debit_card()
	{
		payment2_option_rbt.click();
		
	}
	
	public void select_payment_netBanking()
	{
		netBanking_rbt.click();
		netBanking_dd.click();
		
		
	}
	
	public void select_bank_for_netBanking()
	{
		//int size=netBankingOptions_dd.size();
		//WebElement option=(WebElement) netBankingOptions_dd;
		
		for(WebElement option:netBankingOptions_dd)
		{
			String bank=option.getText();
			
		if ( bank.equalsIgnoreCase("State Bank of India"))
			{
				option.click();
				
		     }
		}
		useThisPaymentMethod_bt.click();
		
		
	}
	
	public void clickOnThePlusconToEnterCardDetailsForPayment()
	{
		plusIconCardDetails.click();
		
	}
	
	public void clickOnTheEnterCardDetailsLinkForPayment()
	{
		enterCardDetails_link.click();
		
	}
	
	public void enterCardDetailsForPayment()
	{
		
		enterCardNumber_tf.sendKeys("1234 1234 1234 1234");
		
	}
	
	public void enterNickNameForPaymentByCreditCard()
	{
		
		enterNickName_tf.sendKeys(Keys.CLEAR);
		
		enterNickName_tf.sendKeys("Apana bank");
		
	}
	
	public void closeEnterCardDetailsPopup()
	{
		enterCardDetails_bt.click();
		
	}
	public void clickOnUPI_rbt_Payment()
	{
		upi_rbt.click();
		enterUpiId_tf.sendKeys("onkkarbargaje@arb");
		
	}
	
	public void clickOnVerifyButtonAfterAddingUPIID()
	{
		clickOnVerify_bt.click();
		
		
	}
	
	public boolean verifyErrorMessageAfterClickingOnVerifyAfterAddingUPIID()
	{
		return errorMessageAfterClickOnVerify.isDisplayed();
		
		
	}
	
}
