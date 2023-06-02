package JavaDatabaseConnection;
import java.sql.*;

public class DB_Cconnection {
	public static void main(String[] args) {
		DB_Cconnection obj_DB_Connection=new DB_Cconnection();
		System.out.println(obj_DB_Connection.get_connection());
	}
	public Connection get_connection(){
		 Connection connection=null;
		try {
		  Class.forName("com.mysql.cj.jdbc.Driver");              
		  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyFirst","root", "root");
		} catch (Exception e) {
		  System.out.println(e);
		}
		  return connection;
		}
	
}
