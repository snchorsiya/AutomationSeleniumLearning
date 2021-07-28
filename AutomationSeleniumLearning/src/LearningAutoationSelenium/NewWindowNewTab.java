package LearningAutoationSelenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowNewTab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Title: " + driver.getTitle());

		// WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);

	}

}
