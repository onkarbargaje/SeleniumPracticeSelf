package amz_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import amz_DDT.Amazon_DDT;
import amz_source.Amz_Login_Paswword;
import amz_source.Amz_Login_UserName;
import amz_source.Amz_Create_Wishlist;
import amz_source.Amz_Navigate_Wishlist1;

public class Amz_Test_09 extends Amz_Test_Launch_Quit
{
	//WebDriver driver;
	
	@Test
	public void scenario_09() throws EncryptedDocumentException, IOException, InterruptedException
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
		anw.moveWishListitemToAnotherWishlist(driver);
		//anw.clickOnSignOut(driver);
		anw.moveOnAccListsDropdown(driver);
		anw.clickOnSignOut(driver);

}
}
