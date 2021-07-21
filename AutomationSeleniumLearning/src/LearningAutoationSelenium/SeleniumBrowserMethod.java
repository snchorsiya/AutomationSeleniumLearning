package LearningAutoationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowserMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/");
		
		String currenUrl = driver.getCurrentUrl();
		
		System.out.println("What is Current URL?"+"\n" + currenUrl);
		
		String pageSource = driver.getPageSource();
		
		System.out.println("What is Page Source?"+"\n" + pageSource);
		
		String Title = driver.getTitle();
		System.out.println("What is your Title?"+"\n"+Title);
		
		//driver.quit();
		
		driver.close();

	}

}
