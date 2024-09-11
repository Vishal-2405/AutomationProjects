package parameterization_in_XML;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameterization {
	/*If we dont want to hardcode any values in the code, let's say username , pw & url are the confidential 
	 * things which user dont want to hardcode it in the code, so parameterization concept is implemented in framework*/
	@Parameters({"URL","Username","Password"})
	@Test
	public void Parameterization(String url, String Uname, String Pwd)
	{
		System.out.println(url);
		System.out.println(Uname);
		System.out.println(Pwd);
		
	}
}
