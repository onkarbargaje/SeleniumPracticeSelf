package amz_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Amz_Create_Wishlist 
{
	
	//click on the create wishlist dd option
	@FindBy(linkText="Create a Wish List")
	WebElement createWishlist_dd;
	
	@FindBy(xpath="(//span[contains(text(),'Your Wish List')])[2]")
	WebElement wishlist_option;
	
	//create list popup text field
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement listName_tf;
	
	//click on the CreateList after adding the list name
		@FindBy(xpath="(//span[@class='a-button a-button-primary'])[3]")
		WebElement createList_bt;
	public Amz_Create_Wishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCreateWishlistOption()
	{
		createWishlist_dd.click();
	}
	
	public void clickOnListNameTFCreateWishlistPopup()
	{
		listName_tf.click();
		//listName_tf.sendKeys(Keys.BACK_SPACE);
		listName_tf.clear();
		listName_tf.sendKeys("Onkar"+Math.random());
		createList_bt.click();
	}
	
	
	 
}
