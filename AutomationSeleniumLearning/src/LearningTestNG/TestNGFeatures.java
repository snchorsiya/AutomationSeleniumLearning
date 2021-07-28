package LearningTestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest()
	{
		System.out.println("Login Test");
		
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void HomePageTest()
	{
		System.out.println("Home Page Test");
		int i = 9/0;
	}
	
	/*
	 * @Test public void SearchPageTest() { System.out.println("Search Page Test");
	 * }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
