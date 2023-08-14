package first_Project_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_test {
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\JAR\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get("https://www.google.com/");
         driver.manage().window().maximize();
         System.out.println("This is before method");
	}
   
	
	@Test(priority=1, description="This is get title ")
	public void getTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
        System.out.println("This is First Test case");

	}
	@Test(priority=2,description="This is Logo Test")
	public void Logotest() {
		boolean b =driver.findElement(By.className("lnXdpd")).isDisplayed();
		System.out.println(b);
        System.out.println("This is Second Test case");

	}
	
	@Test(priority=3)
	public void Click() {
		WebElement element = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		Actions action = new Actions(driver);
		action.click(element).sendKeys("testing").sendKeys(Keys.ENTER).build().perform();
        System.out.println("This is Thired Test case");

	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
        System.out.println("This is for close the browser");

	}
}


