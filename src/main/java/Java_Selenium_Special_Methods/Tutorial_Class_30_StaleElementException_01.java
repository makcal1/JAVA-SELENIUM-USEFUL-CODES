package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_30_StaleElementException_01 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.pavantestingtools.com/");

		driver.manage().window().maximize();
		driver.findElement(By.id("cookieChoiceDismiss")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"LTF_GDPR_Compliant\"]/div/a")).click();
		Thread.sleep(1000);


		WebElement link = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[3]/a"));
		link.click();
		driver.navigate().back();
		Thread.sleep(2000);

		try {
			link.click();

		} catch (StaleElementReferenceException e)

		{
			link = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[3]/a"));
			link.click();
		}



	}

}
