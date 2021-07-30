package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_32_Date_Picker_Automation {

	public static void main(String[] args) {


		String month = "December 2022";
		String expected_date= "24";


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.expedia.ca/");


		driver.findElement(By.id("d1-btn")).click();


		while(true)
		{
			
			WebElement element = driver.findElement(By.xpath("//div[@class='uitk-flex uitk-flex-justify-content-space-between uitk-date-picker-menu-pagination-container']"));
			String text = element.getText();
			System.out.println(element.getText());

			if(element.getText().contains(month))
			{
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/button[2]")).click();

			}
		}


	}

}
