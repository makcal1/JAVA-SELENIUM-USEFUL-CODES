package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_10_Action_Class_04_Slider {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		WebElement slider=  driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform(); // drag the slider 
		
	}

}
