package Java_Selenium_Special_Methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_14_Robot_Class {

	public void entermethood(int a) throws AWTException, InterruptedException {
		try {
			Robot robot = new Robot();
		for (int i = 0; i < a; i++) {
			System.out.println("Deneme");
			robot.keyPress(KeyEvent.VK_ENTER); // ENTER KEY
			 robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
		}}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void shiftmethood(int a) throws AWTException, InterruptedException {
			try {
			Robot robot = new Robot();
			for (int i = 0; i < a; i++) {
				System.out.println("Deneme");
				robot.keyPress(KeyEvent.VK_ESCAPE); // ENTER KEY
				Thread.sleep(1000);
				
			}}
				catch (Exception e) {
					
				
			}
		
	}
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//
		driver.get("https://www.eatthismuch.com/diet-plan/2500-calorie/vegetarian/");
//
		Robot robot = new Robot();
//
//		robot.keyPress(KeyEvent.VK_DOWN); // PRESS DOWN ARROW IN KEYBOARD
//
//		robot.keyPress(KeyEvent.VK_TAB);   // 3 TIME TAB
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_ENTER); // ENTER KEY
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_T);

		// CTRL+T is now pressed 

		//robot.keyRelease(KeyEvent.VK_T);
		// robot.keyRelease(KeyEvent.VK_CONTROL);

		// It will return the parent window name as a String
		 Actions a = new Actions(driver);
		
		Tutorial_Class_14_Robot_Class instance = new Tutorial_Class_14_Robot_Class();
		instance.shiftmethood(8);
		instance.entermethood(2);
	
		
		
		

	
	

	
	}}


