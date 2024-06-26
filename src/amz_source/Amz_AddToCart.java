package amz_source;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import amz_test.Amz_Test_Launch_Quit;

public class   Amz_AddToCart 
{
	//WebDriver driver;
	
	@FindBy(xpath="//*[@id='add-to-cart-button' and @title='Add to Shopping Cart' and @name='submit.add-to-cart' and @type='submit']")
	WebElement addToWishList;
	
	//@FindBy(xpath="(//input[@title='Add to Shopping Cart'])[2]")
	@FindBy(xpath="//div[@id='newAccordionRow_0']//input[@id='add-to-cart-button']")  //for scenario3
	//@FindBy(xpath="(//span[@class='a-button a-spacing-small a-button-primary a-button-icon natc-enabled'])[2]") //for scenario 22
	WebElement addToCart3_bt;
	
	//click on Add to cart button for scenario 24
		@FindBy(xpath="//input[@id='add-to-cart-button']")
		WebElement addToCart_bt_24;
	
	//navigate to cart from top right corner
	@FindBy(xpath="//span[@class='nav-cart-icon nav-sprite']")
	WebElement clickOnCart_bt_top_right;
	
	//navigate to cart button after adding the product to cart
		@FindBy(xpath="//span[@id='attach-sidesheet-view-cart-button']")
		WebElement clickOnCart_bt;
		
	//click on Add to Wshlist bt after selection the product
		@FindBy(id="add-to-wishlist-button-submit")
		WebElement clickAddToWishList_bt;
		
	//close the wishlist popup after adding product to wishlist
				@FindBy(xpath="//div[@class='a-popover-wrapper']//button")
				WebElement clickToWishListPopupClose_bt;		
		
    //click on Buy Now bt after selection the product scenario 17
		@FindBy(xpath="//input[@title='Buy Now']")
		WebElement clickBuyNow_bt;		
	
	public Amz_AddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void addProductToWishList() throws InterruptedException
	{
		/*
		 * WebDriver driver = null;
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(addToWishList ));
		 */
		
		
		addToWishList.click();
		
	}
	public void addToCartButtonScenario3()
	{
		addToCart3_bt.click();
		
	}
	
	public void clickOnCartButtonTopRight()
	{
		clickOnCart_bt_top_right.click();
		
	}
	
	public void clickOnCartButton()
	{
	    clickOnCart_bt.click();
		
	}
	
	public void clickOnAddToWishListButton()
	{
		clickAddToWishList_bt.click();
		
	}
	public void clickOnCloseButtonOnWishListPopup()
	{
		clickToWishListPopupClose_bt.click();
		
	}
	
	public void clickBuyNowButton()
	{
		Assert.assertTrue(clickBuyNow_bt.isDisplayed());
		clickBuyNow_bt.click();
		
	}
	
	public void clickOnAddToCartButton24()
	{
		addToCart_bt_24.click();
		
	}
	
	

}
