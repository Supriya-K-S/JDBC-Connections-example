package CrudOperations;
import java.sql.*;
import java.util.*;
public class InsertUsingpreparedStatement2 {
	public static void main(String[] args) throws SQLException {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		String dburl  ="jdbc:mysql://localhost:3306/admin";
		String user = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(dburl,user,password);		
		
		//dynamic query
		PreparedStatement pst =connection.prepareStatement("insert into employee value(?,?,?)");
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of entries you wish to add");
		int entries = s.nextInt();
		while(entries > 0)
		{
		
		System.out.println("enter the id of employee");
		int id = s.nextInt();
		
		System.out.println("enter the name of the employee");
		String name = s.next();
		
		System.out.println("enter the phone number");
		long phone = s.nextLong();
		
		
		pst.setInt(1,id);
		pst.setString(2,name);
		pst.setLong(3, phone);
		
		int res = pst.executeUpdate();
		System.out.println("one entry has been made");
		
		entries--;
		}
			
				
	  connection.close();
	  pst.close();
       
	}

}
