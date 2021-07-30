package Java_Selenium_Special_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_10_Action_Class_01_MouseOver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();


		Actions actions = new Actions(driver);

		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement userManagement = driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement systemUser = driver.findElement(By.id("menu_admin_viewSystemUsers"));

		 actions.moveToElement(admin).moveToElement(userManagement).moveToElement(systemUser)
		.click().build().perform();







	}

}
