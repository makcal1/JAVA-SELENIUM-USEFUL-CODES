package Java_Selenium_Special_Methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_17_JavaScriptExecuter_Demo {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();

		// Flashing
		WebElement element = driver.findElement(By.xpath("//body/div[@class='wrapper']/header/div[@class='container']/ul[@class='control-bar']/li[1]/a[1]"));
		Thread.sleep(3000);		
		Tutorial_Class_17_JavaScriptExecuter_Utility.drawBorder(element, driver);
		//a[normalize-space()='Contact']y.flash(element, driver);

		//Taking Screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg = new File ("C:\\Users\\muham\\Desktop\\Screenshot\\deneme.png");
		FileUtils.copyFile(src, trg);

		//Capture title of the page
		System.out.println(Tutorial_Class_17_JavaScriptExecuter_Utility.getTitleByJS(driver));


		WebElement contactBtn = driver.findElement(By.xpath("//a[normalize-space()='Contact']"));
		// Generate alert!!
		//Tutorial_Class_17_JavaScriptExecuter_Utility.generateAlert(driver, "You clicked the contact Button for Ilhan Hoca --> See it carefully!!");
		Thread.sleep(2000);		
		Tutorial_Class_17_JavaScriptExecuter_Utility.flash(contactBtn, driver);

		// Click an element with JS
		Thread.sleep(2000);		
		Tutorial_Class_17_JavaScriptExecuter_Utility.clickElementByJS(contactBtn, driver);

		// refreshing page
		Thread.sleep(2000);		
		Tutorial_Class_17_JavaScriptExecuter_Utility.refreshBrowserByJS(driver);

		driver.navigate().back();

		WebElement image =driver.findElement(By.xpath("//img[@src='/newlayout/images/screen.png']"));
		// Scroll the page with the element
		Tutorial_Class_17_JavaScriptExecuter_Utility.scrollIntoView(image, driver);
		// Scroll the page down
		Thread.sleep(3000);		
		Tutorial_Class_17_JavaScriptExecuter_Utility.scrollPageDown(driver);

		//Get Inner Text with JS
		//System.out.println(Tutorial_Class_17_JavaScriptExecuter_Utility.getPageInnerText(driver));



		//Get Browser Info with JS
		System.out.println(Tutorial_Class_17_JavaScriptExecuter_Utility.getBrowserInfo(driver));

	}

}
