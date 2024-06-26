package testngAssignmnetAmazon;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Mobile extends Login_LogOut
{
	@Test
	void searchMobile() throws InterruptedException
	{
		WebElement dd=driver.findElement(By.id("twotabsearchtextbox"));
        dd.sendKeys("Mobile");
        Thread.sleep(4000);
        List<WebElement> ddValues=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
        int count=ddValues.size();
        
        System.out.println(count);
        for(WebElement x:ddValues)
        {
        	
        	if(x.getText().equalsIgnoreCase("mobile under 15000"))
  
        	{
        	    x.click();
        	    
        	    break;
        	}
        	
        }
        
        WebElement mobileSelect=driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]"));
        mobileSelect.click();
        Set<String>WindowsIDs=driver.getWindowHandles();
        System.out.println(WindowsIDs);
        
        Iterator<String> pID= WindowsIDs.iterator();
        String parentID=pID.next();
        System.out.println(parentID);
        String childID=pID.next();
        System.out.println(childID);
        
        driver.switchTo().window(childID);
        
        WebElement addToCart=driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']"));
        addToCart.click();
        Thread.sleep(4000);
        WebElement proceedToBuy=driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']"));
        proceedToBuy.click();
        Thread.sleep(4000);
        
        //driver.close();
        
        
	}

}
