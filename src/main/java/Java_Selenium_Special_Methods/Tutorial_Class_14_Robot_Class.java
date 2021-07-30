package Java_Selenium_Special_Methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_14_Robot_Class {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://spreadsheetpage.com/index.php/site/file/yearly_calendar_workbook");

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN); // PRESS DOWN ARROW IN KEYBOARD

		robot.keyPress(KeyEvent.VK_TAB);   // 3 TIME TAB
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER); // ENTER KEY
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);

		// CTRL+T is now pressed 

		//robot.keyRelease(KeyEvent.VK_T);
		// robot.keyRelease(KeyEvent.VK_CONTROL);

		// It will return the parent window name as a String
		

	
	

	
	}}


