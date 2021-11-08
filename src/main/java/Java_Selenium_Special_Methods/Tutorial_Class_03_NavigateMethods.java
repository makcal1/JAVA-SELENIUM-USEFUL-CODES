package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_03_NavigateMethods {

	public static void main(String[] args) {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com/");
	driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
	
	
	WebElement email = driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("pass"));
	WebElement passwords = driver.findElement(By.id("pass"));
	
	
	
	if(email.isDisplayed() && email.isEnabled()) {
		
		email.sendKeys("sds");
	}
	
	if(password.isDisplayed() && password.isEnabled()) {
		
		password.sendKeys("pasdsd");
	}
	if(passwords.isSelected()) {
		
		System.out.println("Test is passed");
		
	}else {
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.navigate().refresh();
	}
	
	
	//driver.close();
	
}
}