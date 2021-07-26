package LearningAutoationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectDropdwonValue {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");

		Select dropSelect = new Select(driver.findElement(By.id("cars")));
		dropSelect.selectByIndex(1);
		dropSelect.selectByValue("opel");
		dropSelect.selectByVisibleText("Audi");

		System.out.println("Drop Down Supports Multiple Selection? "+ dropSelect.isMultiple());


		// Deselect Dropdwon

		dropSelect.deselectAll();

		/*
		 * dropSelect.deselectByIndex(1); dropSelect.deselectByValue("opel");
		 * dropSelect.deselectByVisibleText("Audi");
		 */

	}

}
