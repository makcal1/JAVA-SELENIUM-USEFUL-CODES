package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_30_StaleElementException_02 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");


		driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/a")).click();

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("makcal@gmail.com");
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("232df");

		driver.navigate().refresh();

		Thread.sleep(2000);

		try {

			email.sendKeys("makcal@gmail.com");
			phone.sendKeys("232df");

		}catch (StaleElementReferenceException e) {

			email = driver.findElement(By.name("email"));
			phone = driver.findElement(By.name("phone"));
			email.sendKeys("makcal@gmail.com");
			phone.sendKeys("232df");

		
		}

	}
}
