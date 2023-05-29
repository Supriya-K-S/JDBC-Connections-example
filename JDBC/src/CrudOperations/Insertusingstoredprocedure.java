package CrudOperations;
import java.sql.*;
public class Insertusingstoredprocedure  {
public static void main(String[] args) throws SQLException {
	Driver driver = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
	
	CallableStatement st = con.prepareCall("call admin.insert(223,'isha',675654455)");
	boolean res = st.execute();
	System.out.println(res);
}
}
