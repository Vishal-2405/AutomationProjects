package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class part_1 {
	/*TestNg will execute the TC's[methods] in alphabetic order*/
	
	@Test
	/* This @Test annotation will treat every method as a single test*/
	public void test()
	{
		System.out.println("test");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	@BeforeTest
	/* This @BeforeTest will treat this method as P1 & executes first
	 * Specific to XML
	 * After this method execution every test will run
	 * */
	public void beforetest()
	{
		System.out.println("beforetest");
	}
	
	@AfterTest
	/* This @AfterTest will treat this method as last priority & executes at last
	 * Specific to XML
	 * After all of the method execution this test will run*/
	public void aftertest()
	{
		System.out.println("aftertest");
	}
	
	
	/*@BeforeSuite
	 * If a method is having this annotation, then that method will be executed at first before the entire test
	 * Specific to XML
	 * */
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforesuite");
	}
	
}
