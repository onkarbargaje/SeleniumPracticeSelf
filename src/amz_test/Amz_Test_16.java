package amz_test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amz_DDT.Amazon_DDT;
import amz_source.Amz_Home;
import amz_source.Amz_Login_Paswword;
import amz_source.Amz_Login_UserName;
import amz_source.Amz_SearchR;
import amz_source.Amz_Share_Product;

public class Amz_Test_16 extends Amz_Test_Launch_Quit
{
	@Test
	public void scenario16() throws EncryptedDocumentException, IOException, InterruptedException {
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
	ah.Search15();
	
	Amz_SearchR asr= new Amz_SearchR(driver);
	asr.productSelectScenario15();
	
	Set<String> ids=driver.getWindowHandles();
	Iterator<String> inids=ids.iterator();
	String parentId=inids.next();
	String childId=inids.next();
	driver.switchTo().window(childId);
	
	Amz_Share_Product asp= new Amz_Share_Product(driver);
	asp.clickOnTheShareIcon();
	asp.selectOptionFromSharedd();
	
}
	}
	

}
