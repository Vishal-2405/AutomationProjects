package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class part_2 {

	@AfterSuite
	/* If a method is having this annotation, this method will execute at last in entire test
	 * specific to XML
	 * */
	public void aftersuite() 
	{
		System.out.println("aftersuite");
	}
	
	@BeforeMethod
	/*If a method is having this annotation, this method will execute before each & every method execution
	 *Ex- if 4 methods are there in a class, this method will execute before each & every method's execution
	 * Specific to class file.
	 * */
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	
	@AfterMethod
	/*If a method is having this annotation, this method will execute after each & every method's execution
	 * Ex- If 4 methods are there in a class, this method will execute after each & every method's execution
	 * Specific to class file.*/
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	
	@BeforeClass
	/*This will execute before all the methods which is having @Test annotation in a single class
	 * This will not call repeatedly
	 * */
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	
	@AfterClass
	/*This will execute after all the method's execution which is having @Test as its annotation
	 * This will not call repeatedly*/
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	@Test
	public void TestExample()
	{
		System.out.println("testexample");
	}
	@Test
	public void TestExample2()
	{
		System.out.println("testexample2");
	}
	
	
}
