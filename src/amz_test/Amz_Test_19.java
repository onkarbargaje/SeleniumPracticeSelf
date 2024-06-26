package amz_test;
//1.Click on search text field and type the name of the product and press enter button
//2.From the search result click on the product that you wish to buy
//3.Click on Buy now button
//4.Select the address where you want the product to the deliver out of available addresses
//5.Click on checkout button
//6. From the list of available payment option click on Pay with debit card, enter card details and place order
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
import amz_source.Amz_Payment;
import amz_source.Amz_SearchR;
import amz_source.Amz_Select_Address;

public class Amz_Test_19 extends Amz_Test_Launch_Quit
{
	
		@Test
		public void scenario19() throws EncryptedDocumentException, IOException, InterruptedException {
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
		ah.Search19();
		
		Amz_SearchR asr= new Amz_SearchR(driver);
		asr.productSelectScenario19();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> inids=ids.iterator();
		String parentId=inids.next();
		String childId=inids.next();
		driver.switchTo().window(childId);

		Amz_AddToCart atc= new Amz_AddToCart(driver);
		atc.clickBuyNowButton();
		
		Amz_Select_Address asa=new Amz_Select_Address(driver);
		asa.address_select();
		asa.address_confirm();
	
		Amz_Payment apay= new Amz_Payment(driver);
		apay.select_payment_netBanking();
		apay.select_bank_for_netBanking();
}
		}
}
