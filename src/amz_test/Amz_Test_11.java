package amz_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amz_DDT.Amazon_DDT;
import amz_source.Amz_Accounts_Lists;
import amz_source.Amz_Login_Paswword;
import amz_source.Amz_Login_UserName;
import amz_source.Amz_Navigate_Wishlist1;

public class Amz_Test_11 extends Amz_Test_Launch_Quit
{
	@Test
	public void scenario11() throws EncryptedDocumentException, IOException, InterruptedException {
	Amazon_DDT ad= new Amazon_DDT();
	ad.excelData();
    Amz_Login_UserName al= new Amz_Login_UserName(driver);
	
	al.un();
	al.Continue();
	
	Amz_Login_Paswword ap= new Amz_Login_Paswword(driver);
	ap.Password();
	ap.SignIn();
	
	Amz_Navigate_Wishlist1 anw= new Amz_Navigate_Wishlist1(driver);
	anw.moveOnAccListsDropdown(driver);
	
	Amz_Accounts_Lists aal= new Amz_Accounts_Lists(driver);
	aal.clickOnSwitchAccountsdd();
	
	
	}

}
