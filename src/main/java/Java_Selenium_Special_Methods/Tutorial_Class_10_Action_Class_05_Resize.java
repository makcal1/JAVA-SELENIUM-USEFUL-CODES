package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_10_Action_Class_05_Resize {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resizable//");
		
		driver.switchTo().frame(0);
		
		WebElement resizeElement = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(resizeElement).dragAndDropBy(resizeElement, 100, 150).build().perform();;
		Thread.sleep(3000);
	

	}

}
