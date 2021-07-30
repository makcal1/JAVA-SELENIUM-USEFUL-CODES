package Java_Selenium_Special_Methods;

import java.awt.image.BufferedImage;
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
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Tutorial_Class_19_Compare_Images {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");


		BufferedImage expectedImage = ImageIO.read(new File("C://Users/muham/Desktop/Images/OrangeHRMlogo.png"));

		WebElement logoImageElement = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Tutorial_Class_17_JavaScriptExecuter_Utility.drawBorder(logoImageElement, driver);
		
		Screenshot logoImageScreenshot  =new AShot().takeScreenshot(driver, logoImageElement);
		BufferedImage actualImage= logoImageScreenshot.getImage();
		
		ImageDiffer imgDiff= new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);
		
		if(diff.hasDiff()==true) // this will compare 2 images
		{
			System.out.println("Images are same");
		}
		else 
		{
			System.out.println("Images are not same");
		}
	}

}
