package LearningAutoationSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();

		WebElement findHelloWorld = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
		String messageHelloWorld = findHelloWorld.getText();
		System.out.println(messageHelloWorld);

	}

}
