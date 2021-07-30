import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import Java_Selenium_Special_Methods.Tutorial_Class_17_JavaScriptExecuter_Utility;
import Java_Selenium_Special_Methods.Tutorial_Class_28_ScreenRecorderUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Recording {
	WebDriver driver;

	@BeforeMethod
	public void setup(){
		WebDriverManager.chromedriver().setup();	

		driver = new ChromeDriver();

	}
	@Test
	public void navigationTest() throws Exception{
		Tutorial_Class_28_ScreenRecorderUtil.startRecord("Checking Links");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		Tutorial_Class_17_JavaScriptExecuter_Utility.scrollPageDown(driver);
		Thread.sleep(3000);
		Tutorial_Class_17_JavaScriptExecuter_Utility.flash(driver.findElement(By.name("txtUsername")), driver);

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Tutorial_Class_17_JavaScriptExecuter_Utility.flash(driver.findElement(By.name("txtPassword")), driver);
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(3000);
		Tutorial_Class_17_JavaScriptExecuter_Utility.flash(driver.findElement(By.name("Submit")), driver);
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(3000);
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();

		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Test passed..");
		}else 
		{
			System.out.println("Test failed..");	
		}
		Thread.sleep(3000);
		Tutorial_Class_28_ScreenRecorderUtil.stopRecord();
	}
	@AfterMethod
	public void tearDown() {
	
		driver.quit();


	}


}
