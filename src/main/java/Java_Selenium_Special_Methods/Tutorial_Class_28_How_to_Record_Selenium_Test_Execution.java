package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_28_How_to_Record_Selenium_Test_Execution {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();	

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		Tutorial_Class_28_ScreenRecorderUtil.startRecord("Checking Links");

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

		Tutorial_Class_28_ScreenRecorderUtil.stopRecord();

		driver.close();

	}



}





