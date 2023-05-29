package CrudOperations;
import java.sql.*;
public class Readusingexecutemethod {
	public static void main(String[] args) throws SQLException {
	Driver driver = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	
	String dburl  ="jdbc:mysql://localhost:3306/admin";
	String user = "root";
	String password = "root";
	Connection connection = DriverManager.getConnection(dburl,user,password);
	
	Statement statement = connection.createStatement();
//	refer notes for this
//	boolean res = statement.execute("select id,phone from employee where id=10");
//	System.out.println(res);
//    ResultSet rs = statement.getResultSet();
//    
//    System.out.println("id\t"+"phone\t");
//    
//    
//    while(rs.next())
//    {
//    	System.out.print(rs.getInt(1)+"\t");//id
//    	//rs.getInt(column index in resultset)
//    	System.out.print(rs.getLong(2)+"\t");//phone
//       //System.out.print(rs.getString("name")+"\t");//name
//    	
//    	
//    }
    
    boolean res = statement.execute("select * from employee where id=10");
	System.out.println(res);
    ResultSet rs = statement.getResultSet();
    
    System.out.println("id\t"+"phone\t");
    
    
    while(rs.next())
    {
    	System.out.print(rs.getInt(1)+"\t");//id
    	//rs.getInt(column index in resultset)
    	System.out.print(rs.getLong(3)+"\t");//phone
       //System.out.print(rs.getString("name")+"\t");//name
    	
    	
    }
    
    
    
    
    
    //step 5S
    statement.close();
    connection.close();
    
    
    
    
	}
}