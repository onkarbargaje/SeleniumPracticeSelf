package amz_source;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_Navigate_Wishlist1 
{
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement helloOnkar;
	
	// click on Your wishlist dd option
	@FindBy(xpath="(//span[contains(text(),'Your Wish List')])[2]")
	WebElement wishlist;
	// click on signOut
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signOut_bt;
	
	// click on delete icon on the wishlist page
	@FindBy(xpath="(//input[@name='submit.deleteItem'])[1]")
	WebElement delete_wishlist_bt;
	
	// check "delete" text display or mnot after click on delete icon on the wishlist page
		@FindBy(xpath="(//div[.='Deleted'])[3]")
		WebElement delete_text;
	
	// click on Move icon on the wishlist page
		@FindBy(xpath="(//span[@class='a-button a-button-base a-button-small'])[2]")
		WebElement move_wishlist_bt;
		
	// click on the Wishlist 1
		@FindBy(xpath="(//span[@class='a-size-base a-text-ellipsis move-to-list-row'])[1]")
		WebElement click_wishlistOption1_dd;
		
	// to get number of items present on the wishlist page
		@FindBy(xpath="//div[@class='a-fixed-right-grid-inner']")
		List<WebElement> count_wishlistItem;
		
		
    // click on the Invite button on wishlist page
		@FindBy(xpath="(//span[contains(text(),'Invite')])[3]")
		WebElement click_Invite_bt;
		
	// click on the view only button on invite popup page
		//@FindBy(xpath="//input[@name='invite-view-only-button']")
		//@FindBy(xpath="//div[@class='a-popover-wrapper']//input[@name='invite-view-only-button']")
		//@FindBy(xpath="//div[@class='a-popover-wrapper']//span[@id='invite-view-only-button-announce']")
		@FindBy(xpath="(//span[@class='a-button a-button-toggle'])[1]")
		WebElement click_ViewOnly_bt;
		
		
	// click on the view and Edit  button on invite popup page
		@FindBy(xpath="//span[@id='invite-view-edit-button-announce']")
		WebElement click_ViewAndEdit_bt;		
				
	// click on the view your list on pop up whic comes after adding product to wishlist
		@FindBy(xpath="//a[.='View Your List']")
		WebElement click_ViewYourList_bt;				
	
	
	
	
	public Amz_Navigate_Wishlist1(WebDriver driver) 
	{
		PageFactory.initElements(driver,this );
	}
	
	public void moveOnAccListsDropdown(WebDriver driver)
	{
		Actions ac= new Actions(driver);
		ac.moveToElement(helloOnkar).perform();
		
	}
	
	public void clickOnSignOut(WebDriver driver) throws InterruptedException 
	{
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(signOut_bt));
		signOut_bt.click();
		
	}
	
	public void clickOnYourWishList(WebDriver driver)
	{
		Actions ac= new Actions(driver);
		ac.moveToElement(helloOnkar).perform();
		wishlist.click();
	}
	public void deleteWishListitem(WebDriver driver) throws InterruptedException
	{
		
		int beforecounto=count_wishlistItem.size();
		System.out.println(beforecounto);


		
		delete_wishlist_bt.click();
		//Thread.sleep(2000);
		//int afterDeleteCount=count_wishlistItem.size();
		//System.out.println(afterDeleteCount);
		//if (afterDeleteCount < beforecounto )
		//{
			//Assert.assertTrue(true);
			//System.out.println("Item deleted from wishlist");
		//}
		//else
		//{
		//	Assert.assertTrue(false);
		//}
		
		if(delete_text.isDisplayed())
		{
			System.out.println("Item is deleted from wishlist");
		
		Actions ac= new Actions(driver);
		ac.moveToElement(helloOnkar).perform();
		signOut_bt.click();
		}
		else
		{
			System.out.println("Item is not deleted from wishlist");
		}
	}
    
	public void moveWishListitemToAnotherWishlist(WebDriver driver)
	{
		move_wishlist_bt.click();
		click_wishlistOption1_dd.click();
		//Actions ac= new Actions(driver);
		//ac.keyDown(move_wishlist_bt, Keys.ARROW_DOWN);
		//move_wishlist_bt.sendKeys(Keys.ARROW_DOWN);
		//move_wishlist_bt.sendKeys(Keys.ENTER);
		
		

	}
	
	public void clickOnInviteBt(WebDriver driver)
	{
		Assert.assertTrue(click_Invite_bt.isDisplayed());
		click_Invite_bt.click();
	}
	
	public void invitePopupActions(WebDriver driver)
	{
		//WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
       // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(click_ViewOnly_bt));
        Assert.assertTrue(click_ViewOnly_bt.isDisplayed());
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_ViewOnly_bt);

        // Click on the element using JavaScript
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", click_ViewOnly_bt);
		click_ViewOnly_bt.click();
	}
	
	public void clickOnViewYourListbt()
	{
		click_ViewYourList_bt.click();
		
	}
	
	public void clickOnViewAndEditbt()
	{
		click_ViewAndEdit_bt.click();
	}
	public void countOfWishlistItems()
	{
		int beforecounto=count_wishlistItem.size();
		System.out.println(beforecounto);
	}
}
