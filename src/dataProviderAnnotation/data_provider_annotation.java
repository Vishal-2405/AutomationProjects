package dataProviderAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider_annotation {

	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
//		Set-1
		data[0][0]="FirstUsername";
		data[0][1]="FirstPassword";
//		Set-2
		data[1][0]="SecondUsername";
		data[1][1]="SecondUsername";
//		Set-3
		data[2][0]="FirstUsername";
		data[2][1]="FirstUsername";
		return data;
	}
	@Test(dataProvider="getData")
	public void logintest(String Username, String PWD)
	{
		System.out.println(Username);
		System.out.println(PWD);
		
	}
	
}
