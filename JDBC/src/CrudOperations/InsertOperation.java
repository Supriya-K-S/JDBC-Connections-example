package CrudOperations;
import java.sql.*;
public class InsertOperation {

	public static void main(String[] args) throws SQLException {
		       //step 1:Load and register the driver
				Driver driver = new com.mysql.cj.jdbc.Driver();
				DriverManager.registerDriver(driver);
				
				//step 2:Establish connection
		        //url is "jdbc:mysql://localhost:portnumber/database_name?user=username&password=password"
				
				String dburl ="jdbc:mysql://localhost:3306/admin?user=root&password=root";
				Connection connection = DriverManager.getConnection(dburl);
				
				//step 3:create statement
				Statement statement = connection.createStatement();
				
				//step 4:issue the query and process the result
				int res = statement.executeUpdate("insert into employee values(208,'rakesh',65654322)");
				System.out.println("Number of rows inserted"+ res);
				
				//step 5:close the connection
				connection.close();
				statement.close();

	}

}
