import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

class JDBC {
 
    // Main driver method
    public static void main(String a[])
    {
 
        // Creating the connection using MySQL DB
  
        String url = "jdbc:mysql://localhost:3306/employee_details";
 
        // Username and password to access DB
        // Custom initialization
        String user = "root";
        String pass = "root";
 
        // Entering the data
        Scanner k = new Scanner(System.in);
       
        System.out.println("Enter Employee Code");
        int empcode = k.nextInt();
 
        System.out.println("Enter Employee Name");
        String empname = k.next();
 
        System.out.println("Enter Employee Age");
        int empage = k.nextInt();
        
        System.out.println("Enter Employee Salary");
        int esalary = k.nextInt();
        
        
 
        // Inserting data using SQL query
        String sql = "insert into employee values('" + empcode
                     + "','" + empname + "'," + empage + "," + esalary + ")";
 
 
        // Connection class object
        Connection con = null;
 
        // Try block to check for exceptions
        try {
 
            // Registering drivers
            DriverManager.registerDriver(
            		new com.mysql.jdbc.Driver ());
 
            // Reference to connection interface
            con = DriverManager.getConnection(url, user,
                                              pass);
 
            // Creating a statement
            Statement st = con.createStatement();
 
            // Executing query
            int m = st.executeUpdate(sql);
            if (m == 1)
                System.out.println(
                    "inserted successfully : " + sql);
            else
                System.out.println("insertion failed");
 
            // Closing the connections
            con.close();
        }
 
        // Catch block to handle exceptions
        catch (Exception ex) {
            // Display message when exceptions occurs
            System.err.println(ex);
        }
    }
}