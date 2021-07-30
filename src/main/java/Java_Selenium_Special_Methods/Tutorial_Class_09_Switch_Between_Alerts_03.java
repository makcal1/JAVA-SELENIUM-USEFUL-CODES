package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_09_Switch_Between_Alerts_03 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
	
		driver.switchTo().alert().sendKeys("BAA CONFIGURATIONS..");
		
		driver.switchTo().alert().accept();
		
		//driver.close();

	}

}
