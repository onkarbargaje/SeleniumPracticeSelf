package seleniumPractice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class TopCastingLearning 
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// from this we can access only SearchContext methods
		SearchContext sc=new ChromeDriver(); 
		sc.findElement(null);
		sc.findElements(null);
		
		WebDriver driver= new ChromeDriver();
		
		
	}

}
