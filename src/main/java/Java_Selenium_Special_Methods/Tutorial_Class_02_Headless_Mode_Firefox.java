package Java_Selenium_Special_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_02_Headless_Mode_Firefox {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);//  <-- First way
		//options.addArguments("--headless"); // <-- Second way

		WebDriver driver = new FirefoxDriver(options);

		driver.get("https://community.microfocus.com/adtd/uft/f/sws-fun_test_sf/5583/http-newtours-demoaut-com-is-this-site-offline");

		System.out.println(driver.getTitle());

	}

}
