package first_Project_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation_Test {
	WebDriver driver;
	@Test(invocationCount=10,priority=1)
	public void sum() {
		int a=10, b=20,c;
		c=a+b;
		System.out.println("Sum = "+c);
	}
	@Test(invocationCount=10)
	public void OpenGoogle() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\JAR\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println("Browser Open");
	}

}
