package LearningAutoationSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMethodWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		String mainHandle = driver.getWindowHandle();
		System.out.println("Main Window Id " + mainHandle + "\n");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		System.out.println("Windows Open After Click " + allHandles.size());
		
		for (String windowHandles: allHandles)
		{
			if (mainHandle.equals(windowHandles))
			{
				System.out.println("\t Window ID 1:\t" + windowHandles +
						"\n \t URL: \t\t" + driver.getCurrentUrl()+
						"\n\t Title:\t\t" + driver.getTitle());
			}
			
			else {
				driver.switchTo().window(mainHandle);
				System.out.println("\t Window ID 2:\t" + windowHandles +
						"\n \t URL: \t\t" + driver.getCurrentUrl()+
						"\n\t Title:\t\t" + driver.getTitle());
			}
		}

	}

}
