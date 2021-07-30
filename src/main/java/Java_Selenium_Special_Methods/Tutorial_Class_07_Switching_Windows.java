package Java_Selenium_Special_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_07_Switching_Windows {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		//System.out.println(driver.getTitle());
		
		Set<String> set=  driver.getWindowHandles();
		
		for (String i : set) {
	
		String t= driver.switchTo().window(i).getTitle();
		
		if(t.contains("Frames & windows"))
		{
			driver.close();
			
		}
		
		}
		
	}
}
