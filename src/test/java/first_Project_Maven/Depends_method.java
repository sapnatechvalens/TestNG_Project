package first_Project_Maven;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_method {
	@Test
	public void test1() {
		System.out.println("Login Page");
		//int i = 50/0;
		Reporter.log("this is the login page");
	}
	
	@Test(dependsOnMethods="test1")
	public void test2() {
		//int i = 50/0;
	System.out.println("It will executed after login and if login failed then it will be skipped");
	}

}
