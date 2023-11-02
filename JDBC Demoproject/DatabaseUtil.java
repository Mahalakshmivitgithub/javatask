
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil 
{
	
	static final String DBURL = "jdbc:mysql://localhost:3306/abcltd";
	static final String USER = "root";
	static final String PASSWORD = "";
	
	 static Connection con;
	
 public	static Connection getConnection()
	{
		try
		{
		con= DriverManager.getConnection(DBURL, USER, PASSWORD);
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
		return con;
	}
	
	

}
