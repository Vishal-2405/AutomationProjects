package annotation_helper_attributes;

import org.testng.annotations.Test;

public class helper_attributes {
		/*Suppose helper_attribute_1() method is dependent on helper_attribute_2(),means
		 *If helper_attribute_2() is the prerequisite to helper_attribute_1(), then
		 *helper_attribute_2() should run first & feed the output info to helper_attribute_1()
		 *For that case we will use "dependsOnMethods" attribute to trigger helper_attribute_2() method first */
		@Test(dependsOnMethods = {"helper_attribute_2"})
		public void helper_attribute_1()
		{
			System.out.println("helper_attribute_1");
		}
		@Test
		public void helper_attribute_2()
		{
			System.out.println("helper_attribute_2");
		}
		
		/*"enabled=false" helper attribute helps us to skip the execution of that method while running the script
		 * This method won't execute because of this helper attribute*/
		@Test(enabled=false)
		public void attribute_3()
		{
			System.out.println("Say this method is not enabled");
		}
		
		/*"timeOut=4000ms" this is an attribute which helps us to wait for a certain time before failing the TC
		 * It is to overcome the drawback of Implicit wait
		 * In implicit wait if we put 40 sec means the performance is going to be down 
		 * because script will wait for 40 sec for each step to execute*/
		
		@Test(timeOut=4000)
		public void attribute_4()
		{
			System.out.println("Timeout of 4000ms is applied successfully");
			
		}
		
		
		
}
