package seleniumPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderByIterator 
{
	@Test (dataProvider="verifyLogin")
	public void verifyLogin(String s ) throws InterruptedException
	{
	   System.out.println(s);
	}
	
	@DataProvider(name="verifyLogin")
	
	public Iterator<String> loginData()
	{
		ArrayList<String> data = new ArrayList<String>();
		data.add("Onkar");
		data.add("Kirti");
		//return data;
		return data.iterator();
	}
}
