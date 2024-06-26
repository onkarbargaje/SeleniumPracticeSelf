package amz_test;

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
import amz_source.Amz_ProceedToBuy;
import amz_source.Amz_SearchR;
import amz_source.Amz_Select_Address;

//1.Click on search text field and type the name of the product and press enter button
//2.From the search result click on the product that you wish to buy
//3.Click on add to wishlist button
//4.Click on add to cart button
//5.Click on Cart button available on the right top corner
//6.Click on proceed to buy button
//7.Select the address where you want the product to the deliver out of available addresses
//8.Click on checkout button
//9. From the list of available payment option click on Pay with debit card, enter card details and place your order
//10.Hoverover Accounts and details button and select the Logout button
public class Amz_Test_03 extends Amz_Test_Launch_Quit
{
	@Test
	public void scenario03() throws EncryptedDocumentException, IOException, InterruptedException {
	Amazon_DDT ad= new Amazon_DDT();
	ad.excelData();
    Amz_Login_UserName al= new Amz_Login_UserName(driver);
	
	al.un();
	al.Continue();
	
	Amz_Login_Paswword ap= new Amz_Login_Paswword(driver);
	ap.Password();
	ap.SignIn();
	
	Amz_Home ah= new Amz_Home(driver);
	ah.Search3();
	
	Amz_SearchR searchP3= new Amz_SearchR(driver);
	searchP3.productSelectScenario3();
	
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> itr=ids.iterator();
	String parentID=itr.next();
	String childID=itr.next();
	driver.switchTo().window(childID);
	
	Amz_AddToCart ac= new Amz_AddToCart(driver);
	ac.addToCartButtonScenario3();
	//ac.clickOnCartButton();
	
	Amz_ProceedToBuy ab=new Amz_ProceedToBuy(driver);
	ab.ProceedToBuy();
	
	Amz_Select_Address as= new Amz_Select_Address(driver);
	as.address_select();
	as.address_confirm();
	
	Amz_Payment apay= new Amz_Payment(driver);
	apay.select_payment_method_debit_card();
	apay.clickOnTheEnterCardDetailsLinkForPayment();
	driver.switchTo().frame(0);
	apay.enterCardDetailsForPayment();
	apay.enterNickNameForPaymentByCreditCard();
	apay.closeEnterCardDetailsPopup();
	
	
}
	
}
