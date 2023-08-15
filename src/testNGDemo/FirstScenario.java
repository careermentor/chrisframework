package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScenario 
{

	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("this is first test case");
		
		Assert.assertEquals("Hello", "Hello1");
		
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test(priority=-2)
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
		Assert.assertEquals("Hello", "Hello1");
	}
	
	@Test(priority=-1)
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
}
