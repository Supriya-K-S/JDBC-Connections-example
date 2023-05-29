package CrudOperations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassforName {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	      //class name is Class, forName is static method its return type is class(whatever we have passed), 
		//it runs all the static methods which have presented in the mentioned class(ie Driver)
		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			String dburl ="jdbc:mysql://localhost:3306/admin?user=root&password=root";
			Connection connection = DriverManager.getConnection(dburl);
			
			
			Statement statement = connection.createStatement();
			
			
			int res = statement.executeUpdate("insert into employee values(248,'rakesh',65654322)");
			System.out.println("Number of rows inserted"+ res);
			
			//step 5:close the connection
			connection.close();
			statement.close();

}

}
