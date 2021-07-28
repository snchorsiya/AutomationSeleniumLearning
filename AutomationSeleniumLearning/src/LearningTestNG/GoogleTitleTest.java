package LearningTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://google.com");
	}

	@Test()
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("What is your Title? " + "\n" + title);
		
		Assert.assertEquals(title, "Google", "title is not matched");
	}
	
	@Test()
	public void googleLogoTest()
	{
		boolean logo = driver.findElement(By.id("hpcta")).isDisplayed();
		System.out.println("Logo Displayed or Not?"+ "\n"  +logo);
		Assert.assertTrue(logo);
		Assert.assertEquals(logo, true);
	}

	@AfterMethod
	public void taryDown() {
		driver.quit();
	}

}
