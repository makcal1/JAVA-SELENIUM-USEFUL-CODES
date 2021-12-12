package Java_Selenium_Special_Methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_14_Robot_Class {

	Robot robot = null;

	public void entermethood(int time) throws AWTException, InterruptedException {
		try {
			robot = new Robot();
			for (int i = 0; i < time; i++) {
				robot.keyPress(KeyEvent.VK_ENTER); 
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);

			}}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tabtmethood(int time) throws AWTException, InterruptedException {
		try {
			robot = new Robot();
			for (int i = 0; i < time; i++) {
				System.out.println("Deneme");
				robot.keyPress(KeyEvent.VK_TAB); 
				Thread.sleep(1000);

			}}
		catch (Exception e) {
			e.printStackTrace();

		}
	}
	public void escapemethood(int time) throws AWTException, InterruptedException {
		try {
			robot = new Robot();
			for (int i = 0; i < time; i++) {
				System.out.println("Deneme");
				robot.keyPress(KeyEvent.VK_ESCAPE); 
				Thread.sleep(1000);

			}}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//
		driver.get("https://github.com/makcal1/Orange_HR_PYTHON_TEST");
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

		driver.findElement(By.xpath("//*[@id=\"branch-select-menu\"]/summary/span[1]")).click();
		Thread.sleep(2000);
		Tutorial_Class_14_Robot_Class instance = new Tutorial_Class_14_Robot_Class();
		//instance.tabtmethood(1);
		//instance.entermethood(2);
		instance.escapemethood(1);








	}}


