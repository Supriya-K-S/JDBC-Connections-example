package insert;
import java.sql.*;
public class SecondJdbc {

	public static void main(String[] args) throws SQLException{
		       //step 1
				Driver driver = new com.mysql.cj.jdbc.Driver();
				DriverManager.registerDriver(driver);
				
				//step 2
				String dburl  ="jdbc:mysql://localhost:3306/admin";
				String user = "root";
				String password = "root";
				Connection connection = DriverManager.getConnection(dburl,user,password);
				
				//step3
				Statement statement = connection.createStatement();
				
				//step 4
				String query = "select * from employee";
				ResultSet rs = statement.executeQuery(query);
				
                System.out.println(rs);
                //it will print object address in hexadecimal because we are not overriding toString() method
                //output will be com.mysql.cj.jdbc.result.ResultSetImpl@3c9754d8
                
                while(rs.next())
                {
                	System.out.println(rs.getInt(1));//id
                	//rs.getInt(column index)
                	System.out.println(rs.getString(2));//name
                	System.out.println(rs.getLong(3));//phone
                	
                }
                //step 5
                statement.close();
                connection.close();

	}

}
