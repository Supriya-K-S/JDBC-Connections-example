package CrudOperations;
import java.sql.*;
import java.util.*;

public class InsertUsingpreparedStatement {
	public static void main(String[] args) throws SQLException {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		String dburl  ="jdbc:mysql://localhost:3306/admin";
		String user = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(dburl,user,password);		
		
		//dynamic query
		PreparedStatement pst =connection.prepareStatement("insert into employee value(?,?,?)");
		pst.setInt(1, 12);
		pst.setString(2, "arya");
		pst.setLong(3, 98767765);
		
		int res = pst.executeUpdate();
		System.out.println(res);
				
				
	  connection.close();
	  pst.close();
       
	}

}
