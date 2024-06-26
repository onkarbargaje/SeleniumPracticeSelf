package amz_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amz_DDT.Amazon_DDT;
import amz_source.Amz_AddToCart;
import amz_source.Amz_Home;
import amz_source.Amz_Login_Paswword;
import amz_source.Amz_Login_UserName;
import amz_source.Amz_Navigate_Wishlist1;
import amz_source.Amz_SearchR;

public class Amz_Test_24 extends Amz_Test_Launch_Quit
{
	@Test
	public void scenario26() throws EncryptedDocumentException, IOException, InterruptedException {
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
			ah.Search24();
			ah.ClickOnSearch();
			
			Amz_SearchR asr= new Amz_SearchR(driver);
			asr.productSelectScenario24();
			
			Amz_AddToCart atc= new Amz_AddToCart(driver);
			//atc.addToCartButton();
			atc.clickOnAddToCartButton24();
			
			Amz_Navigate_Wishlist1 anw = new Amz_Navigate_Wishlist1(driver);
			anw.moveOnAccListsDropdown(driver);
			anw.clickOnSignOut(driver);
			
		}
	}

}
