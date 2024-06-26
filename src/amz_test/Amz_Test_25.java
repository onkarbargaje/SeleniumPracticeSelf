package amz_test;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import amz_DDT.Amazon_DDT;
import amz_source.Amz_AddToCart;
import amz_source.Amz_Home;
import amz_source.Amz_Login_Paswword;
import amz_source.Amz_Login_UserName;
import amz_source.Amz_Navigate_Wishlist1;
import amz_source.Amz_SearchR;

public class Amz_Test_25 extends Amz_Test_Launch_Quit
{
	@Test
	public void scenario25() throws EncryptedDocumentException, IOException, InterruptedException {
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
			ah.ClickOnAllDropdown();
			ah.Search25(driver);
			ah.ClickOnSearch();
			
			Amz_SearchR as= new Amz_SearchR(driver);
			
			as.productSearchScenario25();
			as.productSelectScenario25();
			
			Amz_AddToCart atc= new Amz_AddToCart(driver);
			atc.clickOnAddToWishListButton();
			atc.clickOnCloseButtonOnWishListPopup();
			
			Thread.sleep(5000);
			Amz_Navigate_Wishlist1 anw= new Amz_Navigate_Wishlist1(driver);
			anw.moveOnAccListsDropdown(driver);
			anw.clickOnSignOut(driver);
			
			
			
		}
	}
	
		

}
