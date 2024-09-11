package Framework_lessons;

import org.testng.annotations.Test;

public class Groups{
	@Test
	public void demo1()
	{
		System.out.println("hai");
	}
/*	If we want to execute some set of testcases[methods/functions], we can make use of "groups" 
 * annotation helper attributes to define/declare the set of methods which will fall under a category
 */
	
	@Test(groups= {"Smoke"})
	public void smoke_test1()
	{
		System.out.println("Smoke_1");
	}
	@Test(groups= {"Smoke"})
	public void smoke_test2()
	{
		System.out.println("Smoke_1");
	}
	@Test(groups= {"Regression"})
	public void Regression_test1()
	{
		System.out.println("Regression_1");
	}
	@Test(groups= {"Regression"})
	public void Regression_test2()
	{
		System.out.println("Regression_2");
	}


}
