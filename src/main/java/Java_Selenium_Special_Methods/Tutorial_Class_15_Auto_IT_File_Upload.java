package Java_Selenium_Special_Methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_15_Auto_IT_File_Upload {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	
// AUTO IT TOOL DOWNLOAD --> https://www.autoitscript.com/cgi-bin/getfile.pl?../autoit3/scite/download/SciTE4AutoIt3.exe
// 2.STEP --> DOWNLOAD FROM THE MAIN PAGE  --> https://www.autoitscript.com/site/autoit/downloads/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
		
		driver.findElement(By.id("employeeId")).click();
		Thread.sleep(2000);
		
		Robot robot = new Robot();
	
		robot.keyPress(KeyEvent.VK_TAB);   // 3 TIME TAB
	//	robot.keyPress(KeyEvent.VK_TAB); 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);// ENTER KEY
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C://Users/muham/Desktop/FileUpload.exe");
		
		
		
	}

}
