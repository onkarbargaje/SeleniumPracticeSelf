package amz_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz_DDT.Amazon_DDT;
import amz_test.Amz_Test_Launch_Quit;

public class Amz_SearchR  extends Amazon_DDT
{
	//WebDriver driver;
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement product_1;
	
	
	//for scenario 17 &23 also
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	WebElement product_2;
	
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement scenario13_search;
	
	//Scenario 3 & 19 & 20  search result headphone
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement scenario3_search;
	
	//Scenario 15 search result powerbank
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement scenario15_search;
	
	//Scenario 22 search result Appliances
		@FindBy(xpath="(//div[@class='a-carousel-viewport']//div//div)[2]")
		WebElement scenario22_search;
		
	//Scenario 23 search result Appliances
		@FindBy(xpath="//li[@id='sobe_d_b_6_2']//img[@alt='Shop now']")
		WebElement scenario23_search;	
	
		//Scenario 24 search result Books
				@FindBy(xpath="(//div[@class='a-carousel-viewport']//li)[3]")
				WebElement scenario24_search;		
	//Scenario 25 search 
		@FindBy(xpath="(//div[@class='DealGridItem-module__dealItemContent_1vFddcq1F8pUxM8dd9FW32'])[1]")
		WebElement scenario25_search;
		
	//Scenario 25 search confirm product
		@FindBy(xpath="(//a[@class='a-size-base a-color-base a-link-normal a-text-normal'])[1]")
		WebElement scenario25_search_confirm;	
	
	
	public Amz_SearchR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchProductSelect()
	{
		product_1.click();
	}
	
	public void searchProduct2Select()
	{
		product_2.click();
	}
	public void productSelectScenario13()
	{
		scenario13_search.click();
	}
	
	public void productSelectScenario3()
	{
		scenario3_search.click();
	}
	
	public void productSelectScenario15()
	{
		scenario15_search.click();
	}
	
	public void productSelectScenario17()
	{
		product_2.click();
		product_2.getText();
		System.out.println(product_2.getText());
	}
	
	public void productSelectScenario19()
	{
		scenario3_search.click();
	}
	
	public void productSelectScenario20()
	{
		scenario3_search.click();
	}
	
	public void productSelectScenario22()
	{
		scenario22_search.click();
	}
	
	public void productSelectScenario23()
	{
		scenario23_search.click();
		product_2.click();
	}
	
	public void productSelectScenario24()
	{
		scenario24_search.click();
		//product_2.click();
	}
	
	public void productSearchScenario25()
	{
		scenario25_search.click();
	}
	
	public void productSelectScenario25()
	{
		scenario25_search_confirm.click();
		
	}



}
