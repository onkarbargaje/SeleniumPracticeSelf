package amz_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amz_DDT.Amazon_DDT;
import amz_source.Amz_Create_Wishlist;
import amz_source.Amz_Login_Paswword;
import amz_source.Amz_Login_UserName;
import amz_source.Amz_Navigate_Wishlist1;

//1.Hoverover the Account & Lists button
//2.Click on your wishlist  and click on invite button below my shopping
//3.Click on view only button from invite peoples to your wishlist popup
//4.Hoverover Accounts and details button and select the Logout button
public class Amz_Test_14 extends Amz_Test_Launch_Quit
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
	
	Amz_Navigate_Wishlist1 anw= new Amz_Navigate_Wishlist1(driver);
	anw.clickOnYourWishList(driver);
	anw.clickOnInviteBt(driver);
	driver.switchTo().frame(0);
	Thread.sleep(1000);
	anw.invitePopupActions(driver);
	
	//org.openqa.selenium.ElementClickInterceptedException
	
	
	}
	

}
}
