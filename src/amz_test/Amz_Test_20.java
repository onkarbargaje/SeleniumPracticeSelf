package amz_test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import amz_DDT.Amazon_DDT;
import amz_source.Amz_AddToCart;
import amz_source.Amz_Home;
import amz_source.Amz_Login_Paswword;
import amz_source.Amz_Login_UserName;
import amz_source.Amz_Payment;
import amz_source.Amz_SearchR;
import amz_source.Amz_Select_Address;

public class Amz_Test_20 extends Amz_Test_Launch_Quit
{
	@Test
	public void scenario20() throws EncryptedDocumentException, IOException, InterruptedException {
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
	ah.Search20();
	
	Amz_SearchR asr= new Amz_SearchR(driver);
	asr.productSelectScenario20();
	
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
	apay.clickOnUPI_rbt_Payment();
	apay.clickOnVerifyButtonAfterAddingUPIID();
	//apay.verifyErrorMessageAfterClickingOnVerifyAfterAddingUPIID();
	Assert.assertTrue(apay.verifyErrorMessageAfterClickingOnVerifyAfterAddingUPIID());
}	
	}

}
