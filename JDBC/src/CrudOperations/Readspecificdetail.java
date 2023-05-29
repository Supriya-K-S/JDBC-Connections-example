package CrudOperations;
import java.sql.*;
import java.util.*;
public class Readspecificdetail {
	public static void main(String[] args) throws SQLException {
		 //step 1
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		//step 2
		String dburl  ="jdbc:mysql://localhost:3306/admin";
		String user = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(dburl,user,password);
		
		//step3
		String query = "select * from employee where id=?";
		PreparedStatement pst =connection.prepareStatement(query);
		Scanner s = new Scanner(System.in);
		System.out.println("enter the id");
		int id = s.nextInt();
		pst.setInt(1, id);
		boolean result = pst.execute();
		ResultSet rs = pst.getResultSet() ;
		
		//step4
       System.out.println("id\t"+"phone\t"+"name");
       
       
       while(rs.next())
       {
       	System.out.print(rs.getInt(1)+"\t");//id
       	//rs.getInt(column index in resultset)
       	System.out.print(rs.getLong(3)+"\t");//phone
       	System.out.print(rs.getString("name")+"\t");//name
       	
       	
       }
       //step 5
       pst.close();
       connection.close();

}


}
