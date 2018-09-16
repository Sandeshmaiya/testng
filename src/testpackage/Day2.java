package testpackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	
	@AfterSuite
	public void SuiteExecution(){
		System.out.println("SuiteExecutioncomplete");
	}	
	
	@Test(dependsOnMethods ={"Supertest", "Supertest2" })// To have multiple methods Depend on then have Comma Separator 
	public void atest3 (){
		System.out.println("testing3");// Dependsonmethod cannot be used for exclude of XML and @Before or @After annotations 

}
	
	@Test(timeOut=4000)
	public void Supertest() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("Super test");
	}
	
	@Parameters({"URL"})
	@Test
	public void Supertest3(String url) throws InterruptedException{
		
		System.out.println(url);
	}
	
	@Test(enabled =true)// "Enabled", "dependsOnMethods", "groups", "timeOut" are TestNg ***Helper*** Attributes
	public void Supertest2(){
		System.out.println("Super test2");
	}
	
	@BeforeTest
	public void prerequites(){
		System.out.println("Clean All the Data from Database");// To Set Global Environment variables; Execute's On priority.
	}
	
	@AfterTest
	public void postrequites(){
		System.out.println("Close Browser");
	}
	
	@BeforeSuite	
	public void Suitenew(){
		System.out.println("SuiteExecution");
	}
}
