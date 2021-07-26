package LearningAutoationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValueHandleDropdwon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		WebElement findJobTitle = driver.findElement(By.id("empsearch_job_title"));
		Select selectJobTitle = new Select(findJobTitle);
		selectJobTitle.selectByValue("2");

		Select subUnit = new Select( driver.findElement(By.id("empsearch_sub_unit")));
		subUnit.selectByIndex(3);

		Select includeSelect = new Select(driver.findElement(By.id("empsearch_termination")));
		includeSelect.selectByVisibleText("Past Employees Only");

	}

}
