package LearningAutoationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrameIndex {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.yourhtmlsource.com/frames/inlineframes.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1250)");

		driver.switchTo().frame(3);

		driver.findElement(By.xpath("//*[@id=\"htmlsource\"]/a")).click();

	}

}
