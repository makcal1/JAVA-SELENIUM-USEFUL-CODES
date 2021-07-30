package Java_Selenium_Special_Methods;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_09_Switch_Between_Alerts_02 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.switchTo().alert().dismiss();
		
		String expectedText = "You Pressed Cancel"
				+ "";
		String actualText = driver.findElement(By.id("demo")).getText();
		
		if(actualText.equals(expectedText))
		{
			System.out.println("Test is passed..");
			System.out.println(actualText);
		}
		else {
			System.out.println("Test failed...");
			System.out.println(actualText);
		}
		
		
		

	}

}
