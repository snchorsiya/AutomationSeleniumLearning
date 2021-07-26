package LearningAutoationSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	public static void main(String[] args)  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);

		// Thread.sleep(3000); // Thread.sleep Not use in Page Load TimeOut

		driver.get("https://opensource-demo.orangehrmlive.com/");

		System.out.println("What is Page Title?" + "\n" + driver.getTitle());
	}

}
