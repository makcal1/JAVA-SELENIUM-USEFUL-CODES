package Java_Selenium_Special_Methods;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_25_HashMap_in_Selenium {

	static HashMap<String, String> logindata()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("x", "mercury@mercury");
		hm.put("y", "mercury1@mercury1");
		hm.put("z", "mercury2@mercury2");

		return hm;

	}


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Login as x

		String credentials = logindata().get("y");
		
		String arr[]= credentials.split("@"); // mercury mercury

		driver.findElement(By.id("txtUsername")).sendKeys(credentials);
		
		driver.findElement(By.id("txtPassword")).sendKeys(arr[1]);
	
	}

}
