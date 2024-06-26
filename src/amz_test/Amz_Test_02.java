package amz_test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import amz_DDT.Amazon_DDT;
import amz_source.Amz_AddToCart;
import amz_source.Amz_Home;
import amz_source.Amz_Login_Paswword;
import amz_source.Amz_Login_UserName;
import amz_source.Amz_Payment;
import amz_source.Amz_ProceedToBuy;
import amz_source.Amz_SearchR;
import amz_source.Amz_Select_Address;

public class Amz_Test_02 extends Amz_Test_Launch_Quit
{
	@Test
	public void scenario_2() throws EncryptedDocumentException, IOException, InterruptedException
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
		ah.Search2();
		
		Amz_SearchR searchP2= new Amz_SearchR(driver);
		searchP2.searchProduct2Select();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> itr=ids.iterator();
		String parentID=itr.next();
		String childID=itr.next();
		driver.switchTo().window(childID);
		
		Amz_AddToCart ac= new Amz_AddToCart(driver);
		ac.addProductToWishList();
		
		Amz_ProceedToBuy ab= new Amz_ProceedToBuy(driver);
		ab.ProceedToBuy();
		
		Amz_Select_Address as= new Amz_Select_Address(driver);
		as.address_select();
		as.address_confirm();
		
		Amz_Payment apay= new Amz_Payment(driver);
		apay.select_payment_netBanking();
		apay.select_bank_for_netBanking();
		
		
		
		
		
		
	}

}
