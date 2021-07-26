package LearningAutoationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		WebDriverWait wait = new WebDriverWait(driver, 5);

		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));

		WebElement findHelloWorld = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
		String messageHelloWorld = findHelloWorld.getText();
		System.out.println(messageHelloWorld);

	}

}
