package Java_Selenium_Special_Methods;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_16_Cookies_Example_Adding_Cookies {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		Set<Cookie> cookies = driver.manage().getCookies();

		System.out.println(cookies.size());

		// add new cookie to browser
		Cookie cobj = new Cookie("Murat Cookies","12345690");
		driver.manage().addCookie(cobj);

		cookies=driver.manage().getCookies();

		for (Cookie cookie : cookies)// read and print all cookies
		{	 

			System.out.println(cookie.getName() + " "  +cookie.getValue()); // print name and value of cookies

		}

	}

}
