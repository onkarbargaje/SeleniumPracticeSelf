package amz_test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amz_DDT.Amazon_DDT;
import amz_source.Amz_Accounts_Lists;
import amz_source.Amz_AddToCart;
import amz_source.Amz_Home;
import amz_source.Amz_Login_Paswword;
import amz_source.Amz_Login_UserName;
import amz_source.Amz_Navigate_Wishlist1;
import amz_source.Amz_SearchR;

public class Amz_Test_13 extends Amz_Test_Launch_Quit
{
	
	@Test
	public void scenario13() throws EncryptedDocumentException, IOException, InterruptedException {
	Amazon_DDT ad= new Amazon_DDT();
	ad.excelData();
    Amz_Login_UserName al= new Amz_Login_UserName(driver);
	
	al.un();
	al.Continue();
	
	Amz_Login_Paswword ap= new Amz_Login_Paswword(driver);
	ap.Password();
	ap.SignIn();
	
	Amz_Home ah= new Amz_Home(driver);
	ah.AllSearch();
	
	Amz_SearchR as= new Amz_SearchR(driver);
	as.productSelectScenario13();
	
	Set<String> wIds=driver.getWindowHandles();
	Iterator<String> id=wIds.iterator();
	id.next();
	String childId=id.next();
	driver.switchTo().window(childId);
	
	Amz_AddToCart ac= new Amz_AddToCart(driver);
	ac.addProductToWishList();
	
	Amz_Navigate_Wishlist1 aw= new Amz_Navigate_Wishlist1(driver);
	aw.moveOnAccListsDropdown(driver);
	aw.clickOnSignOut(driver);
	

}
}

