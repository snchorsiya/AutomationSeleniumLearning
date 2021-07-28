package LearningTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	/*
		@BeforeSuite -- Setup system property for Chrome -I
		@BeforeTest -- Launch Chrome Browser - II
		@BeforeClass -- Loging app - III
		
		
		@BeforeMethod -- Enter the URL - IV
		@Test -- googleLogoTest
		@AfterMethod -- Logout app
		
		@BeforeMethod -- Enter the URL
		@Test -- Google Title Test
		@AfterMethod -- Logout app
		@BeforeMethod -- Enter the URL
		@Test -- searchTest
		@AfterMethod -- Logout app
		@AfterClass -- Close Browser
		@AfterTest -- deleteAllCookies
	 */
	
	//Pre-conditions annotations -- starting with @Before
	
	@BeforeSuite //1
	public void setUp()
	{
		System.out.println("@BeforeSuite -- Setup system property for Chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser()
	{
		System.out.println("@BeforeTest -- Launch Chrome Browser");
	}
	
	
	@BeforeClass //3
	public void longin()
	{
		System.out.println("@BeforeClass -- Loging app");
	}
	
	
	/*
	 * @BeforeMethod
	 * @Test -1
	 * @AfterMethod
	 * 
	 * @BeforMethod
	 * @Test -2
	 * @AfterMethod
	 * 
	 * @BeforMethod
	 * @Test -3
	 * @AfterMethod
	 * 
	 */
	
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("@BeforeMethod -- Enter the URL");
	}
	

	
	//test case - starting with @Test
	@Test //5
	public void googleTitleTest()
	{
		System.out.println("@Test -- Google Title Test");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("@Test -- searchTest");
	}
	
	@Test
	public void googleLogoTest()
	{
		System.out.println("@Test -- googleLogoTest");
	}
	
	
	//post conditions - starting with @After
	
	@AfterMethod //6
	public void logOut()
	{
		System.out.println("@AfterMethod -- Logout app");
	}
	@AfterClass //7
	public void closeBrowser()
	{
		System.out.println("@AfterClass -- Close Browser");
	}
	
	@AfterTest //8
	public void deleteAllCookies()
	{
		System.out.println("@AfterTest -- deleteAllCookies");
	}
	
	
	
	
}
