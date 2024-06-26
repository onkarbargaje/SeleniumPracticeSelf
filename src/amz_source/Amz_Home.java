package amz_source;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz_DDT.Amazon_DDT;
import amz_test.Amz_Test_Launch_Quit;

public class Amz_Home  extends Amazon_DDT
{
	//WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	
	@FindBy(id="nav-search-submit-button")
    WebElement search_bt;
	
	//for scenario 16 click on All button
		@FindBy(xpath="//select[@id='searchDropdownBox']")
		WebElement all_dropdown;
		
	//for scenario 25 click on All button to get list of option
				@FindBy(xpath="//select[@id='searchDropdownBox']/option")
				List<WebElement> all_dropdown_options;	
		
		
		
		
	
	public Amz_Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSearch()
	{
		
		search_bt.click();
		
	}
	public void Search()
	{
		search_tf.sendKeys("mobile");
		search_bt.click();
		
	}
	public void Search2()
	{
		search_tf.sendKeys(search2ExcelData);
		search_bt.click();
		
	}
	public void Search3()
	{
		search_tf.sendKeys(search3ExcelData);
		search_bt.click();
		
	}
	
	//for scenario 15 click on All button
	public void AllSearch()
	{
		all_dropdown.click();
		//all_dropdown.sendKeys(Keys.ARROW_DOWN);
		//all_dropdown.sendKeys(Keys.ARROW_DOWN);
		//all_dropdown.sendKeys(Keys.ARROW_DOWN);
		//all_dropdown.sendKeys(Keys.ARROW_DOWN);
		//all_dropdown.sendKeys(Keys.ARROW_DOWN);
		//all_dropdown.sendKeys(Keys.ARROW_DOWN);
		
		//all_dropdown.sendKeys(Keys.ENTER);
		String desiredOption="Amazon Pharmacy";
		
		for (int i=0; i<all_dropdown_options.size(); i++)
		{
			if (all_dropdown_options.get(i).getText().equalsIgnoreCase(desiredOption))
			{
				all_dropdown_options.get(i).click();
				System.out.println("Desired Option is Clicked");
				break;
			}
		}
		
		
		search_tf.sendKeys("cough syrup");
		search_bt.click();
	}
	
	public void Search15()
	{
		search_tf.sendKeys(search15ExcelData);
		search_bt.click();
		
	}
	
	public void Search16()
	{
		search_tf.sendKeys(search16ExcelData);
		search_bt.click();
		
	}
	
	public void Search17()
	{
		search_tf.sendKeys(search17ExcelData);
		search_bt.click();
		
	}
	
	public void Search19()
	{
		search_tf.sendKeys(search19ExcelData);
		search_bt.click();
		
	}
	public void Search20()
	{
		search_tf.sendKeys(search20ExcelData);
		search_bt.click();
		
	}
	public void ClickOnAllDropdown()
	{
		
		all_dropdown.click();
		String all_dd_Options=all_dropdown.getText();
		System.out.println(all_dropdown.getText());
		
	}

	public void Search25(WebDriver driver)
	{
		String desiredOption="Clothing & Accessories";
		all_dropdown_options.size();
		//Actions actions = new Actions(driver);
		System.out.println(all_dropdown_options.size());
		
		for (int i=0;i<all_dropdown_options.size();i++)
		{
			if(all_dropdown_options.get(i).getText().contains(desiredOption))
			{
				all_dropdown_options.get(i).click();
				System.out.println("Desired Option is Clicked");
				break;
				
			}
		}
		
		//if (all_dropdown.getText().equalsIgnoreCase(desiredOption))
		//{
			//actions.click();
		//}
	}
		
		public void Search24()
		{
			String desiredOption2= "Books";
			
			for(int i=0; i<all_dropdown_options.size(); i++)
			{
				if(all_dropdown_options.get(i).getText().equalsIgnoreCase(desiredOption2))
				{
					all_dropdown_options.get(i).click();
					System.out.println("Desired Option is Clicked: " + desiredOption2);
					break;
				}
			}
		}
		
		public void Search22()
		{
             String desiredOption2= "Appliances";
			
			for(int i=0; i<all_dropdown_options.size(); i++)
			{
				if(all_dropdown_options.get(i).getText().equalsIgnoreCase(desiredOption2))
				{
					all_dropdown_options.get(i).click();
					System.out.println("Desired Option is Clicked");
					break;
				}
			}
		}
		
		public void Search23()
		{
             String desiredOption2= "Beauty";
			
			for(int i=0; i<all_dropdown_options.size(); i++)
			{
				if(all_dropdown_options.get(i).getText().equalsIgnoreCase(desiredOption2))
				{
					all_dropdown_options.get(i).click();
					System.out.println("Desired Option is Clicked");
					break;
				}
			}
		}
		
		
	}

