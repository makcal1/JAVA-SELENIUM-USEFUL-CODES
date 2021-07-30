package Java_Selenium_Special_Methods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_13_01_FileUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed  {
		// NOTE!! : YOU NEED TO DOWNLOAD A JAR FILE FROM SKULI WEBSITE BEFORE 
		//Jar File Website --> https://launchpad.net/sikuli/+milestone/1.1.2
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
		WebElement element=	driver.findElement(By.id("photofile"));
		
		Actions actions = new Actions(driver);
		
		actions.doubleClick(element);
		
		String imagesFilePath = "C:\\Users\\muham\\Pictures\\photox.PNG";
		String inputFilePath = "C:\\Users\\muham\\Pictures\\photox.PNG";
		
		Screen s = new Screen();
		
		Pattern fileInputTextbox=new Pattern(imagesFilePath+"FileTextBox.PNG");
		Pattern openButton = new Pattern(imagesFilePath+"OpenButton.PNG");		
		
		Thread.sleep(5000);
		
		s.wait(fileInputTextbox,20);  //It will be wait until file is present
		s.type(fileInputTextbox,inputFilePath);
		s.click(openButton);
		
		
	}

}
