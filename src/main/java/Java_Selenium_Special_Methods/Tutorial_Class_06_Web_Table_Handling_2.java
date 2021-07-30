package Java_Selenium_Special_Methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_06_Web_Table_Handling_2 {

	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://goo.gl.kNZ6Sr");
		driver.manage().window().maximize();
		
	
		
		driver.findElement(By.xpath("-----")).click();
		
		Select y = new Select(driver.findElement(By.xpath("select")));
		y.selectByVisibleText("2017");
		
		//future month&date
		for(int i =6;i>1;i--) {
			driver.findElement(By.xpath("-----")).click();
			
			String m = driver.findElement(By.xpath("****")).getText();
			
			if(m.equalsIgnoreCase("september"))
			{
				driver.findElement(By.linkText("12")).click();
				break;
			}
			
		}
	}

}
