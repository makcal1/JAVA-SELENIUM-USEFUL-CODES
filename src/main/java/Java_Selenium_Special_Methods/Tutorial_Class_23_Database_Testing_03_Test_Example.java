package Java_Selenium_Special_Methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorial_Class_23_Database_Testing_03_Test_Example {

	public static void main(String[] args) throws SQLException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		Connection myConnection = null;
		Statement myStatement = null;
		ResultSet myResult =null;

		String connectionUrl = "jdbc:mysql://localhost:3306/amazonbooks";
		String username="root";
		String password="ANKARA06..";

		myConnection = DriverManager.getConnection(connectionUrl, username, password);

		System.out.println("Database connection is succecfull!\n");

		myStatement = myConnection.createStatement();

		String s = "select *from ORANGEHRM;";
		
		ResultSet rs = myStatement.executeQuery(s);
		
		while(rs.next())
		{
			String user = rs.getString("username");
			String psw = rs.getString("password");


			System.out.println(user);

			driver.findElement(By.id("txtUsername")).sendKeys(user);
			driver.findElement(By.id("txtPassword")).sendKeys(psw);
			driver.findElement(By.id("btnLogin")).click();

		}
		myConnection.close();

	}

}
