package Java_Selenium_Special_Methods;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_20_Barcode_Testing {

	public static void main(String[] args) throws IOException, NotFoundException {

		// Jar file dosyalarini bu site uzerinden indir ve build path ile depenceny'e ekle
		// https://www.youtube.com/watch?v=M2cypkjI93c&list=PLUDwpEzHYYLs6G9WOfFxiH5zMfgNxgmSV&index=32

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");	
		Tutorial_Class_17_JavaScriptExecuter_Utility.scrollPageDown(driver);

		String barcodeURL = driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[1]"))
				.getAttribute("src"); // barcode icin elementi locate ettikten sonra url attribute kismini eklemeyi unutma

		System.out.println("The barcode URL is : " + barcodeURL);	


		URL url = new URL(barcodeURL);

		BufferedImage bufferedImage = ImageIO.read(url);

		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);

		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));

		Result result=  new MultiFormatReader().decode(binaryBitmap);
		
		String barcodeText= result.getText(); 

		System.out.println("The Barcode Text is : " + barcodeText);
		System.out.println("The Barcode Format is : " + result.getBarcodeFormat());
	
	
		// You can create your own barcode --> https://barcode.tec-it.com/en/
		
	}

}
