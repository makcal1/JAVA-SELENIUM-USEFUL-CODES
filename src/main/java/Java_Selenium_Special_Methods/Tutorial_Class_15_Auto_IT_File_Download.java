package Java_Selenium_Special_Methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_15_Auto_IT_File_Download {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		Thread.sleep(2000);
		
		driver.findElement(By.id("secondpassword")).click();
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);  
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB); 
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\muham\\Desktop\\AUTO_IT\\FileUploadForDownloading.exe");
	
	}

}
