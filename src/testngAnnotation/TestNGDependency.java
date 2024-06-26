package testngAnnotation;

import org.testng.annotations.Test;

public class TestNGDependency
{
	public String trackNumber= null;
	@Test (priority = 1)
	public void createShipment()
	{
        //System.out.println(5/0);
		System.out.println("createShipment");
		trackNumber= "123ABCF23";
		
	}
	
	@Test ( dependsOnMethods = {"createShipment"} )
	public void trackShipment() throws Exception
	{
		if(trackNumber!= null) {
		System.out.println("createShipment");
		}
		else 
			throw new Exception("Tracking number is not available");
		
	}
	
	@Test ( dependsOnMethods = {"createShipment","trackShipment"} )
	public void cancelShipment() throws Exception
	{
		if(trackNumber!= null) {
			System.out.println("cancelShipment");
			}
			else 
				throw new Exception("Tracking number is not available");
		
	}
	

}
