package Java_Selenium_Special_Methods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_26_Extent_Report_Information {

	public static void main(String[] args) {

		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
	}

}
