package CrudOperations;
import java.sql.*;
public class Deleteusingstoredprocedure {
	public static void main(String[] args) throws SQLException {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
		
		CallableStatement st = con.prepareCall("call admin.delete(58)");
		int res = st.executeUpdate();
		System.out.println(res);
		
		
		//using execute method
		//boolean  res = st.execute();
		//System.out.println(res);
	}
}
