package Java_Selenium_Special_Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_05_Dropdown {
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://testautomationpractice.blogspot.com/");
		WebElement element1 = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		WebElement element2 = driver.findElement(By.id("Wsdsdwfdfd3ewrfd"));


				driver.manage().window().maximize();
		
				WebElement element=driver.findElement(By.id("products"));
		
				Select select = new Select(element);
			
				List list = new ArrayList(); 
		
				List<WebElement> options = select.getOptions();
		
				for (WebElement e : options) 
				{
		
					list.add(e.getText());
		
				}
				System.out.println(list);
		
				List tempList = new ArrayList();
				
				tempList = list;
				
				System.out.println("Before sorting temp list: " +tempList);
				
				Collections.sort(tempList);
				System.out.println("After sorting the list :" + tempList);
				
				if(list == tempList)
				{
					System.out.println("Dropdown sorted");
				}
				else {
					System.out.println("Dropdown is not sorted..");
				}
	}

}
