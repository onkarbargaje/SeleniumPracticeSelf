package amz_test;
//1.Hoverover Accounts and lists button 
//2.Click on create a wishlist under your lists
//3.Click on create a list and give name to list,again click on create list button

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amz_DDT.Amazon_DDT;
import amz_source.Amz_Create_Wishlist;
import amz_source.Amz_Login_Paswword;
import amz_source.Amz_Login_UserName;
import amz_source.Amz_Navigate_Wishlist1;

public class Amz_Test_12 extends Amz_Test_Launch_Quit
{
	@Test
	public void scenario12() throws EncryptedDocumentException, IOException, InterruptedException {
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
	
	Amz_Create_Wishlist acw= new Amz_Create_Wishlist(driver);
	acw.clickOnCreateWishlistOption();
	acw.clickOnListNameTFCreateWishlistPopup();
	
	Set<String> ids=driver.getWindowHandles();
	System.out.println(ids);
	//Iterator<String> itr=ids.iterator();
	//String parentID=itr.next();
	//String childID=itr.next();
	//System.out.println(parentID);
	//System.out.println(childID);
	

}
}
