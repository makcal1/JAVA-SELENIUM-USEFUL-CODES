package selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class LogintestOnWIndowsusingChrome {
	static WebDriver driver;
	@Test
	void setUp() throws MalformedURLException
	{
		
		String nodeUrl = "http://192.168.10.1:16897/wd/hub";
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		WebElement x = driver.findElement(By.xpath("//aa"));
		
		
		
		System.setProperty("webdriver.chrome.driver","C:/Users/muham/Desktop/IE BROWSER/chromedriver.exe" );
		driver = new RemoteWebDriver(new URL(nodeUrl),cap);
	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		String subscribeBtn = driver.findElement(By.id("Subscriber_link")).getText();

		if (subscribeBtn.contains("Subscribe"))
		{
			System.out.println("Test passed..");
		}else {
			System.out.println("Test failed..");
		}
		driver.close();
	}

	@Test
	void login()
	{

		System.out.println("Test completed");

	}	
}
