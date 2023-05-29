package CrudOperations;
import java.sql.*;
import java.util.*;
public class Updateusingexecutemethod {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		String dburl  ="jdbc:mysql://localhost:3306/admin";
		String user = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(dburl,user,password);
		
		Statement statement = connection.createStatement();
		boolean res = statement.execute("update employee set name='meera' where id=104");
		System.out.println(res);
		
		connection.close();
		statement.close();
		

	}

}
