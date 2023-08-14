package first_Project_Maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Launch Browser
//Login into browser
//Enter Url
//Open Browser
//Logout from browser
//Close The Browser
//PASSED: first_Project_Maven.first.OpenBrowser
public class first {
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	@BeforeMethod
	public void Login() {
		System.out.println("Login into browser");
		
	}
   
	
	@BeforeMethod
	public void Url() {
		System.out.println("Enter Url");
	}
	
	@Test
	public void OpenBrowser() {
		System.out.println("Open Browser");
		
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Logout from browser");
	}
	@AfterGroups
	public void deletecookies() {
	System.out.println("Delte Cookies");
	}
	
	@AfterClass
	public void close() {
		System.out.println("Close The Browser");
	}
	
	}


