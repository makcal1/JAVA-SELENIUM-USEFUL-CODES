package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_12_Download_Files_02_ForFirefox_Browser {

	public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();

	
	
	// creating browser profile
	
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("browser.helperApps.neverAsk", "text/plain");
	profile.setPreference("browser.download.manager.showWhenStarting", false);
	
	FirefoxOptions option = new FirefoxOptions();
	option.setProfile(profile);
	
	WebDriver driver = new FirefoxDriver(option);
	
	driver.get("http://demo.automationtesting.in/FileDownload.html");
	
	driver.findElement(By.id("textbox")).sendKeys("Testing");
	
	driver.findElement(By.id("createTxt")).click();
	
	driver.findElement(By.id("link-to-download")).click();  
	
	
	driver.switchTo().frame(0);
	
	driver.switchTo().alert().accept();
	
	
	
	
	

	}

}
