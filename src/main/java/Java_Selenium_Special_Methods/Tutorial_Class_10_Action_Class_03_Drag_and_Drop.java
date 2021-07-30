package Java_Selenium_Special_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_10_Action_Class_03_Drag_and_Drop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		Actions actions = new Actions(driver);
		
		WebElement Stocholm = driver.findElement(By.id("box2"));
		
		WebElement Sweden= driver.findElement(By.id("box102"));
		
		actions.dragAndDrop(Stocholm, Sweden).build().perform();
		
		
		
	}

}
