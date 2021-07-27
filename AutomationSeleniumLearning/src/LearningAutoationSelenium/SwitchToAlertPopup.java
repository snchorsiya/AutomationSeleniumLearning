package LearningAutoationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());


	}

}
