package LearningTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); //launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://google.com");
	}
	
	@Test(priority = 1, groups = "title")
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println("What is your Title? " + "\n" + title);
	}
	
	@Test(priority = 2, groups = "logo")
	public void googleLogoTest()
	{
		boolean logo = driver.findElement(By.id("hpcta")).isDisplayed();
		System.out.println("Logo Displayed or Not?"+ "\n"  +logo);
		
	}
	
	@Test(priority = 3, groups = "link")
	public void gmailLinkTest()
	{
		boolean link = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("Gmail Link Displayed or Not?" + "\n" +link);
	}
	
	@Test(priority = 4, groups = "link")
	public void imageLinkTest()
	{
		boolean image = driver.findElement(By.linkText("Images")).isDisplayed();
		System.out.println("Image Link Displayed or Not?" + "\n" + image);
	}
	
	@Test(priority = 5, groups = "test")
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority = 6, groups = "test")
	public void test2()
	{
		System.out.println("test2");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
