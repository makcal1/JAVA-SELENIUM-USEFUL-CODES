package Java_Selenium_Special_Methods;

import java.awt.image.BufferedImage;
import java.io.IOException;

import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_21_QR_Code_Testing {

	public static void main(String[] args) throws IOException, NotFoundException {

		// Jar file dosyalarini bu site uzerinden indir ve build path ile depenceny'e ekle
		// https://www.youtube.com/watch?v=5Ihbu93zxIU&list=PLUDwpEzHYYLs6G9WOfFxiH5zMfgNxgmSV&index=33
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");	
		Tutorial_Class_17_JavaScriptExecuter_Utility.scrollPageDown(driver);
		
		String QR_CODE_URL= driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/img")).getAttribute("src");

		URL url = new URL(QR_CODE_URL);

		BufferedImage bufferedImage = ImageIO.read(url);

		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);

		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));

		Result result=  new MultiFormatReader().decode(binaryBitmap);

		
		
		System.out.println("The QR CODE Text is : " + result.getText());
		System.out.println("The QR CODE Format is : " + result.getBarcodeFormat());
		System.out.println("The QR CODE Metadata is : " + result.getResultMetadata());
		System.out.println("The QR CODE NumBits is : " + result.getNumBits());
		System.out.println("The QR CODE Timestamp is : " + result.getTimestamp());
		
		// QR-CODE Generator --> https://www.the-qrcode-generator.com/
	}

}
