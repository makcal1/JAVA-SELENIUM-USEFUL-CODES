package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Tutorial_Class_22_Microsoft_Edge_Browser_Testing {

	public static void main(String[] args) {
		
		// Download microsoft edge driver --> https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
		 
		//Step 1
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		
		//Step 2
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Step 3
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		//Step 4
		
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Test passed..");
		}else 
		{
		System.out.println("Test failed..");	
		}
		
		
		

	}

}
