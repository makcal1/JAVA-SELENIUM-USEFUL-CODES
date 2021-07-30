package Java_Selenium_Special_Methods;


import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_18_EncodingAndecodingExampleWith_Selenium_Login_Page {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/login");

		// Go to Login Page
		driver.findElement(By.linkText("Log in")).click();

		// Sending credentials
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(decodeString("bXVoYW1tZWRAZ21haWwuY29t"));
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(decodeString("YWRtaW4xMjM="));

		//Clicking login button
		//	driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

	}



	static String decodeString(String username_or_password)
	{
		byte[] encode= Base64.decodeBase64(username_or_password.getBytes());

		return new String(encode);


	}



}
