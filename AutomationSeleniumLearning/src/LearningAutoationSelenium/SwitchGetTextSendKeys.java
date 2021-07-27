package LearningAutoationSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchGetTextSendKeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.sendKeys("I am Automation Engineer");
		alert.accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());
		
		
	}

}
