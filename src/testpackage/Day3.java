package testpackage;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test(groups={"Smoke"})
	public void WebloginCarloan (){
		System.out.println("Web_Carloan");

}
	@Test
	public void MobileloginCarloan (){
		System.out.println("mobile_Carloan_login");

}
	
	@Test
	public void MobilelogoutCarloan (){
		System.out.println("mobile_Carloan_logout");

}
}
