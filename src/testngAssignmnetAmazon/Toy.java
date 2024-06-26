package testngAssignmnetAmazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Toy extends Login_LogOut
{
	@Test(enabled=false)
	void SearchToy() throws InterruptedException
	{
	WebElement dd=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    dd.sendKeys("Toy");
    Thread.sleep(4000);
    List<WebElement> ddValues=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
    int count=ddValues.size();
    
    System.out.println(count);
    for(WebElement x:ddValues)
    {
    	
    	if(x.getText().equalsIgnoreCase("toys for 3 year old boy"))

    	{
    	    x.click();
    	    
    	    break;
    	}
    	
    }

	}
}
