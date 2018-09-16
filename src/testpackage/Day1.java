package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Day1 {	
	
	
	@BeforeClass
	public void test12 (){
		System.out.println("Class Execution ");
	}
	
	@AfterClass
	public void test13 (){
		System.out.println("Class Execution ended ");
	}
	
	@Test
	public void test (){
		System.out.println("testing1");
	}
	
	@AfterMethod	
	public void Aftermeth(){
		System.out.println("execute this After method");
	}	
	@BeforeMethod	
	public void Beforemet(){
		System.out.println("execute this before method");
	}
	@Test(groups={"Smoke"})
	public void test2(){
		System.out.println("Testing 2");
	}
	
}
