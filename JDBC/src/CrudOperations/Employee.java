package CrudOperations;

import java.sql.*;


public class Employee {

	public static void main(String[] args) {
		
		try {
			
			//step 1
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
			//step2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			
			//step 3
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			//step 4
			ResultSet rs = st.executeQuery("select * from employee");
			
			rs.last();  
			
			while(rs.previous()) {  
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getLong(3));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

