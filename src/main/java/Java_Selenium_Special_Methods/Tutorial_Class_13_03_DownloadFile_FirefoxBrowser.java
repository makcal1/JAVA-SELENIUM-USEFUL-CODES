package Java_Selenium_Special_Methods;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_13_03_DownloadFile_FirefoxBrowser {

	public static void main(String[] args) {

	
		FirefoxProfile profile = new FirefoxProfile();
		
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf");
		profile.setPreference("browser.download.manager.showWhenStarting", false);

		//download files in desired location
		profile.setPreference("browser.download.dir", "C:\\Downloadedfiles"); //download location
		profile.setPreference("browser.download.folderList",2);
		profile.setPreference("pdfjs.disabled", true); //only for pdf file
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(option);

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
