package testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test(groups={"Smoke"})
	public void WebloginHomeloan (){
		System.out.println("Web_HomeLoan");

}
	@Parameters({"URL", "APIKEY"})
	@Test 
	public void MobileloginHomeloan (String urlname, String key){
		System.out.println(urlname);
		System.out.println(key);

}
	
	@Test(dataProvider ="getdata")
	public void ApiloginHomeloan (String usrname,  String pwd){
		System.out.println(usrname);
		System.out.println(pwd);

}

	@DataProvider
	public Object[][] getdata(){ 
		
		Object[][] data = new Object [3][2];// Row, Column, Multi Dimensional Array Creation.
		data[0][0] = "1st set User name ";
		data[0][1] = "1st Set password";
		
		data[1][0]= "2nd set User name";
		data[1][1]= "2nd Set password";
		
		data[2][0]= "3rd set User name";
		data[2][1]= "3rd Set password";
		 return data;
	}//Parameterization,  Drive the data from TestNg File  or using Annotation DataProvider 
}
