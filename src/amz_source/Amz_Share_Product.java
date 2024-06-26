package amz_source;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_Share_Product 
{
	// click on the share button
	@FindBy(xpath="//a[@title='Share']")
	WebElement share_bt;
	
	//pick the one otion from share dropdown
	@FindBy(xpath="//div[@class='a-popover-content']//div")
	List<WebElement> share_options_dd;
	
	
	public Amz_Share_Product (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void clickOnTheShareIcon()
	{
		share_bt.click();
		share_bt.sendKeys(Keys.ARROW_DOWN);
		share_bt.sendKeys(Keys.ENTER);
	}
	
	public void selectOptionFromSharedd()
	{
		String desiredOption="Facebook";
		
		for(int i=0;i<share_options_dd.size(); i++)
		{
			if(share_options_dd.get(i).getText().equalsIgnoreCase(desiredOption))
			{
				share_options_dd.get(i).click();
				System.out.println("Desired option from share dropdown selected");
				break;
			}
			else
			{
				System.out.println("Desired option from share dropdown is not selected");
			}
		}
	}
	

}
