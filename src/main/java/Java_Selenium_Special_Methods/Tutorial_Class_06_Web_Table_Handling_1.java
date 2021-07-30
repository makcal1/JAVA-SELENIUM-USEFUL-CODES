package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_06_Web_Table_Handling_1 {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click(); 
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		int rowCount = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
		
		int statusCount = 0;
		
		for (int i = 1; i <= rowCount; i++) {
			
			String status = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr["+i+"]/td[5]")).getText();
			
			if(status.equals("Enabled")) {
				statusCount =statusCount+1;
			}
		}
		
		System.out.println("No of employess Enabled: " + statusCount);
		driver.close();
	}

}
