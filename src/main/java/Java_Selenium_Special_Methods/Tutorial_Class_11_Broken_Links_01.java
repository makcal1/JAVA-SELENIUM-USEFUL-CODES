package Java_Selenium_Special_Methods;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_11_Broken_Links_01 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://portal.spinent.eu/");

		Thread.sleep(3000);

		/*
		 * 1-) Capture links
		 * 2-) Count number of broken links
		 */

		List<WebElement>links=	driver.findElements(By.tagName("a"));
		
		System.out.println(links.size()); // Number of links
		
		for (int i = 0; i < links.size(); i++) 
		{
			
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			// create a connection using url object 'link'
			HttpURLConnection httpURL =(HttpURLConnection) link.openConnection();
			
			Thread.sleep(2000);
			
			httpURL.connect();
			
			int responseCode = httpURL.getResponseCode();
			
			if(responseCode >=400)
			{
				System.out.println(url + " -" + "is broken link");
			}
			else {
				System.out.println(url + " -" + "is valid link");
			}
			
		}


	}

}
