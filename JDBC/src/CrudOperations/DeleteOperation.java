package CrudOperations;
import java.sql.*;
public class DeleteOperation {
	public static void main(String[] args) throws SQLException {
		       //step 1
				Driver driver = new com.mysql.cj.jdbc.Driver();
				DriverManager.registerDriver(driver);
				
				//step 2
		        //url is "jdbc:mysql://localhost:portnumber/database_name?user=username&password=password"
				
				String dburl ="jdbc:mysql://localhost:3306/admin?user=root&password=root";
				Connection connection = DriverManager.getConnection(dburl);
				
				//step 3
				Statement statement = connection.createStatement();
				
				//step 4
				int res = statement.executeUpdate("delete from employee where id=101");
				System.out.println("Number of rows deleted"+ res);
				
				//step 5
				connection.close();
				statement.close();

	}


}
