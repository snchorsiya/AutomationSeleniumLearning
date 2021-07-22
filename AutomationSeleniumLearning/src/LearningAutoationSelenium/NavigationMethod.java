package LearningAutoationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.linkedin.com/");

		//driver.get("https://www.linkedin.com/");
		
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
		driver.navigate().refresh();
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println("What is Title Name?"+ "\n"+ title);
		
		driver.navigate().forward();
		String pastitle = driver.getTitle();
		System.out.println("What is Title Name?"+ "\n" + pastitle);

	}

}
