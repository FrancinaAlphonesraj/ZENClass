package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcconnection {
	// MySQL Database Details
	   static final String DB_URL = "jdbc:mysql://localhost:3306/employee_details";
	   static final String USER = "root";
	   static final String PASS = "root";

	   public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {		      
	         // Execute a query
	         System.out.println("Inserting records into the table...");          
	         String sql = "INSERT INTO employeedata VALUES (101, 'Jenny', 25, 10000)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO employeedata VALUES (102, 'Jacky', 30, 20000)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO employeedata VALUES (103, 'Joe', 20, 40000)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO employeedata VALUES(104, 'John', 40, 80000)";
	         stmt.executeUpdate(sql);
	         sql = "INSERT INTO employeedata VALUES(105, 'Shameer', 25, 90000)";
	         stmt.executeUpdate(sql);
	         System.out.println("Inserted records into the table...");   	  
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }

}
