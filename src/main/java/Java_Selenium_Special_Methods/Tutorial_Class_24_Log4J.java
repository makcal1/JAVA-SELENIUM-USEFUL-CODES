package Java_Selenium_Special_Methods;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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

public class Tutorial_Class_24_Log4J {

	public static void main(String[] args) {
		// Bu siteye gidip jar dosyasini mirror sekmesine tikladiktan sonta BACKUP SITES kismindan indir
		// --> https://logging.apache.org/log4j/2.x/download.html
		
		// log4j. properties kismini da olustur

		
		Logger logger = Logger.getLogger("Log4jExample");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("----Info---");
	
	}
	
	
	
	}


