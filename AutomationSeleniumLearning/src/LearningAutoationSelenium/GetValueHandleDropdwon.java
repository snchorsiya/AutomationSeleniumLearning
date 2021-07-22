package LearningAutoationSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetValueHandleDropdwon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\git\\AutomationSeleniumLearning\\AutomationSeleniumLearning\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		System.out.println("1st Defalut Color: " + select.getFirstSelectedOption().getText());
		
		select.selectByVisibleText("Black");
		System.out.println("What is Color Select: " + select.getFirstSelectedOption().getText());
		
		Select carSelect = new Select(driver.findElement(By.id("cars")));
		List<WebElement> listCar = carSelect.getOptions();
		System.out.println("Get All Car");
		
		for(WebElement car: listCar) {
			System.out.println("\t"+ car.getText());
		}
		
		Select dropSelect = new Select(driver.findElement(By.id("cars")));
		dropSelect.selectByIndex(1);
		dropSelect.selectByValue("opel");
		dropSelect.selectByVisibleText("Audi");
		
		List<WebElement> selectCarList = dropSelect.getAllSelectedOptions();
		System.out.println("What is Car Select?");
		
		for(WebElement selectCar: selectCarList)
		{
			System.out.println("\t"+ selectCar.getText());
		}

	}

}
