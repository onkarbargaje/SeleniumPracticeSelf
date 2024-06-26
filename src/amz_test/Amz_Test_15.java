package amz_test;
//1.Click on search text field and type the name of the product and press enter button
//2.From the search result click on the product that you wish to buy
//3. Click on add to wishlist button
//4.Click on your wishlist  and click on invite button below my shopping
//5.Click on view and edit button from invite people to your wishlist popup
//6.Select friend to whom you want to share
//7.Hoverover Accounts and details button and select the Logout button
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amz_DDT.Amazon_DDT;
import amz_source.Amz_AddToCart;
import amz_source.Amz_Home;
import amz_source.Amz_Login_Paswword;
import amz_source.Amz_Login_UserName;
import amz_source.Amz_Navigate_Wishlist1;
import amz_source.Amz_SearchR;

public class Amz_Test_15 extends Amz_Test_Launch_Quit
{
	
	@Test
	public void scenario14() throws EncryptedDocumentException, IOException, InterruptedException {
{
	Amazon_DDT ad= new Amazon_DDT();
	ad.excelData();
    Amz_Login_UserName al= new Amz_Login_UserName(driver);
	
	al.un();
	al.Continue();	
	
	
	Amz_Login_Paswword ap= new Amz_Login_Paswword(driver);
	ap.Password();
	ap.SignIn();
	
	Amz_Home ah= new Amz_Home(driver);
	ah.Search15();
	
	Amz_SearchR asr= new Amz_SearchR(driver);
	asr.productSelectScenario15();
	
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> inids=ids.iterator();
	String parentId=inids.next();
	String childId=inids.next();
	driver.switchTo().window(childId);
	
	Amz_AddToCart atc= new Amz_AddToCart(driver);
	atc.clickOnAddToWishListButton();
	
	Amz_Navigate_Wishlist1 anw= new Amz_Navigate_Wishlist1(driver);
	anw.clickOnViewYourListbt();
	anw.clickOnInviteBt(driver);
	anw.clickOnViewAndEditbt();
	
}

}
}
