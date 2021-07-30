package Java_Selenium_Special_Methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Tutorial_Class_23_Database_Testing_02_Delete_Function {
	 static final String QUERY = "select *from books;";
	public static void main(String[] args) throws SQLException  {

		Connection myConn =null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String urlString = "jdbc:mysql://localhost:3306/amazonbooks";
		String username="bob";
		String password="Ankara06..";
		
	
					
		try {
			myConn = DriverManager.getConnection(urlString,username,password);
			
			
			System.out.println("Database connection successful!\n");
			
			
			//2. Create a statement			
			
			myStmt = myConn.createStatement();
			
			 String sql = "delete from books where title = 'Melekler';";
			           
			         myStmt.executeUpdate(sql);
			         ResultSet rs = myStmt.executeQuery(QUERY);
			         while(rs.next()){
			            //Display values
			            System.out.println("TITLE: " + rs.getString("title"));
			          
			          
			         }
			       
			         rs.close();
			      } catch (SQLException e) {
			         e.printStackTrace();
			      } 
			   }
			}