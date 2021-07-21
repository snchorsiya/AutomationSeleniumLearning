package LearningAutoationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DispalayedEnabledElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.id("menu_admin_viewAdminModule")).click();

		WebElement buttonDelete = driver.findElement(By.id("btnDelete"));

		boolean isDeleteButtonDisplay = buttonDelete.isDisplayed();
		boolean isEnableButtonDisplay = buttonDelete.isEnabled();

		System.out.println("Befor Click - Is Delete Button Displayed and Enabled? " + "\n\t" + "Displayed = "
				+ isDeleteButtonDisplay + "\n\t" + "Enable = " + isEnableButtonDisplay + "\n");

		driver.findElement(By.xpath("//a[text()='Aaliyah.Haq']/preceding::input[1]")).click();

		isDeleteButtonDisplay = buttonDelete.isDisplayed();
		isEnableButtonDisplay = buttonDelete.isEnabled();

		System.out.println("After Click - Is Delete Button Displayed and Enabled? " + "\n\t" + "Displayed = "
				+ isDeleteButtonDisplay + "\n\t" + "Enable = " + isEnableButtonDisplay + "\n");
	}

}
