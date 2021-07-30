package AllureReporting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners({AllureListener.class})
public class Tests extends BaseClass{

	public WebDriver driver;

	@BeforeClass 
	public void setUp() {
		BaseClass bs= new BaseClass();
		driver = bs.initialize_driver();
		driver.get("https://demo.nopcommerce.com/");

	}
	@Test(priority = 1,description = "Verify Logo Presence on Home Page ")
	@Description("Verify Logo presence")
	@Epic("EP001")
	@Feature("Feature1: Logo")
	@Story("Story: Logo presence")
	@Step("Verify Logo Presence")
	@Severity(SeverityLevel.NORMAL)
	public void logoPresence()
	{
		boolean disStatus=	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertEquals(disStatus, true);

	}
	
	@Test(priority = 2)
	@Description("Verify Login")
	@Epic("EP001")
	@Feature("Feature2: Login")
	@Story("Story: Valid Login")
	@Step("Verify Login")
	@Severity(SeverityLevel.BLOCKER)
	public void loginTest()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("makcal@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("makcalm");
		driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
		Assert.assertEquals(driver.getTitle(), "--nopCommerce demo store. Login");


	}
	
	@Test(priority = 3)
	@Description("Verify user Registration...")
	@Epic("EP001")
	@Feature("Feature3: Registration")
	@Story("Story: Valid Registration")
	@Step("Verify Registration")
	@Severity(SeverityLevel.BLOCKER)
	public void registrationTest()
	{
		throw new SkipException("Skipping this Test"); // We can skip this test
	}

	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	
}
