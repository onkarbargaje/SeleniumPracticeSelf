package amz_test;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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


public class Amz_Test_01 extends Amz_Test_Launch_Quit
{
	//ChromeDriver driver;
	
	
	@Test
	public void scenario_1() throws InterruptedException, EncryptedDocumentException, IOException
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
		ah.Search();
		
		Amz_SearchR ar=new Amz_SearchR(driver);
		ar.searchProductSelect();
		
		
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parentID=it.next();
		String childID=it.next();
		Thread.sleep(4000);
		driver.switchTo().window(childID);
		
		Amz_AddToCart atc= new Amz_AddToCart(driver);
		atc.addToCartButtonScenario3();
		atc.clickOnCartButton();
		
		
		
		Amz_ProceedToBuy ab= new Amz_ProceedToBuy(driver);
		ab.ProceedToBuy();
		
		
		Amz_Select_Address as= new Amz_Select_Address(driver);
		
		as.address_select();
		as.address_confirm();
		
		Amz_Payment apay= new Amz_Payment(driver);
		apay.select_payment_method();
		
		
	
	
	
	}
	
	

}
