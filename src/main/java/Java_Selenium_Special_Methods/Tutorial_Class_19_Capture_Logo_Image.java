package Java_Selenium_Special_Methods;



import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Tutorial_Class_19_Capture_Logo_Image {

	public static void main(String[] args) throws IOException {

		/**
		 * 
		 * 
Download Links of API jars
-------------
ashot 1.5.3
https://mvnrepository.com/artifact/ru...

Gson 2.8.5
https://mvnrepository.com/artifact/co...

Hamcreast-all 1.3
https://mvnrepository.com/artifact/or...

For Jar FIles --> https://jar-download.com/artifacts/ru.yandex.qatools.ashot/ashot/1.5.3/source-code

Youtube Video to configure into the system --> https://www.youtube.com/watch?v=1CBS1AQy6zo&list=PLUDwpEzHYYLs6G9WOfFxiH5zMfgNxgmSV&index=31
		 * 
		 * 
		 * 
		 * 
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement logoImageElement = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Tutorial_Class_17_JavaScriptExecuter_Utility.drawBorder(logoImageElement, driver);
		Screenshot logoImageScreenshot  =new AShot().takeScreenshot(driver, logoImageElement);
		ImageIO.write(logoImageScreenshot.getImage(),"png",new File("C://Users//muham//Desktop//Images//OrangeHRMlogo.png"));

		File f = new File("C:\\Users\\muham\\Desktop\\Screenshot\\deneme.png");

		if(f.exists())
		{
			System.out.println("Image File Captured");
		}else {
			System.out.println("Image File Not exist");
		}
	}

}
