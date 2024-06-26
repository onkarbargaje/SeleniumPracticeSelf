package testngAnnotation;
import org.testng.annotations.Test;

public class testngAnnotation 
{
	@Test (enabled=false)
	void add()
	{
		System.out.println("1");
	}
	
	@Test (invocationCount=5)
	void ddd1()
	{
		System.out.println("2");
	}
	
	@Test
	void zdd2()
	{
		System.out.println("5");
	}

	@Test
	void add3()
	{
		System.out.println("3");
	}
	
	@Test
	void bdd4()
	{
		System.out.println("4");
	}
}
