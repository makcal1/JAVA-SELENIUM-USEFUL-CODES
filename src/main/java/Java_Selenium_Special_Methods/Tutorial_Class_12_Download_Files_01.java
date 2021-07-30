package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_12_Download_Files_01 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/FileDownload.html");	
		
		driver.findElement(By.id("textbox")).sendKeys("Testing");
		
		driver.findElement(By.id("createTxt")).click();
		
		driver.findElement(By.id("link-to-download")).click();  
		
		
		driver.findElement(By.id("pdfbox")).sendKeys("testing pdf download");
		
		driver.findElement(By.id("createPdf")).click();
		
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		
		
	}

}
