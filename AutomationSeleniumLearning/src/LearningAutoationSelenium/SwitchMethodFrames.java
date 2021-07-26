package LearningAutoationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMethodFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		// Using Index
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("fname")).sendKeys("Test");
		driver.findElement(By.name("lname")).sendKeys("demo");
		
		String ValidationMessage = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div[1]/p")).getText();
		System.out.println("What is Your Validation Message?" + "\n" + ValidationMessage);
		
		// Using WebElement
		
		WebElement login = driver.findElement(By.xpath("//iframe[contains(@src,'innerFrame')]"));
		driver.switchTo().frame(login);
		
	//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'innerFrame')]")));
		
		driver.findElement(By.name("email")).sendKeys("admin123@gmail.com");

	}

}
