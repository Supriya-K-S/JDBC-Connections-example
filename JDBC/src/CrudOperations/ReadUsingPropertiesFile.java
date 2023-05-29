package CrudOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ReadUsingPropertiesFile {
	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException{
		 //step 1
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		
		FileInputStream fs = new FileInputStream("D:\\WorkspaceForJDBC\\JDBC\\src\\insert\\credential.properties");
		//file has username and password
		Properties p = new Properties();
		p.load(fs);
		
		//step 2
		String dburl = "jdbc:mysql://localhost:3306/admin";
		Connection connection = DriverManager.getConnection(dburl,p);
		
		Statement statement = connection.createStatement();
		
		String query = "select name,phone from employee";
		ResultSet rs = statement.executeQuery(query);
		
		while(rs.next())
       {
       	
       	System.out.println(rs.getString(1));//name
       	//here we are not passing the column number of column "name" in database but just passing the column index number of resultset
       	System.out.println(rs.getLong(2));//phone
       	
       }
       //step 5
       statement.close();
       connection.close();
		
		
		
	}


}
