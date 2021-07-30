package Java_Selenium_Special_Methods;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_13_02_DownloadFile_ChromeBrowser {

	public static void main(String[] args) {
		
		//download files in required location using chrome
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.prompt_for_download", "false");
		chromePrefs.put("download.default_directory","C:\\Downloadedfiles"); // download location
	
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		cap.setCapability(ChromeOptions.CAPABILITY,options); // end of code
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(cap);

		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		//donwload text file
		driver.findElement(By.id("textbox")).sendKeys("testing file download");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();

		if(isFileExist("C:\\Downloadedfiles\\info.txt")) {
			
			System.out.println("file exist");
		}else {
			System.out.println("file not exist");
		}
		
		driver.findElement(By.id("pdfbox")).sendKeys("testing pdf download");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		

		if(isFileExist("C:\\Downloadedfiles\\info.pdf")) {
			
			System.out.println("file exist");
		}else {
			System.out.println("file not exist");
		}
	}
	static boolean isFileExist(String path)
	{
		File f = new File(path);
		if(f.exists())
		{
			return true;
		}else {
			return false;
		}
	}
}
