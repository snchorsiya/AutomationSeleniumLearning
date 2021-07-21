package LearningAutoationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElementMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://sharpspring.com/");
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("username")).sendKeys("RexAllenJones@Hotmail.com");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("login-button")).submit();
		String ErrorMessage = driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/ul/li[1]/h4")).getText();
		System.out.println("What is Error Message Show?"+ "\n" + ErrorMessage);
		
		String PlaceHolder = driver.findElement(By.id("password")).getText();
		System.out.println("getText = I Will Enter My"+ PlaceHolder);
		
		String strPasswordLabel = driver.findElement(By.id("password")).getAttribute("placeholder");
		System.out.println("getAttribute = I Will Enter My "+ strPasswordLabel);

	}

}
