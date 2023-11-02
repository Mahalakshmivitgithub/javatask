import java.sql.*;

public class DatabaseController 
{

	static PreparedStatement ps;
	static Connection con;
	
	
	public static void create(String name, double salary)
	{
		con = DBUtil.getConnection();
		try
		{
			ps = con.prepareStatement("INSERT INTO employee(name,salary)values(?,?)");
			
			ps.setString(1, name);
			ps.setDouble(2, salary);
			
			if(!ps.execute())
			{
				System.out.println("Record Inserted!");
			}
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
	}
	
	
	public static void update(int empiId, String name, double salary)
	{
		con = DBUtil.getConnection();
		try
		{
			ps = con.prepareStatement("UPDATE employee SET name=?, salary=? WHERE empId=?");
			
			ps.setString(1, name);
			ps.setDouble(2, salary);
			ps.setInt(3, empiId);
			
			if(!ps.execute())
			{
				System.out.println("Record Updated!");
			}
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
	}
	
	
	public static void delete(int empiId)
	{
		con = DBUtil.getConnection();
		try
		{
			ps = con.prepareStatement("DELETE FROM employee WHERE empId=?");
			
		
			ps.setInt(1, empiId);
			
			if(!ps.execute())
			{
				System.out.println("Record Deleted !");
			}
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
	}
	
	public static void display()
	{
		con = DBUtil.getConnection();
		try
		{
			ps = con.prepareStatement("Select * from employee  Where salary>60000 ORDER BY empId");
			
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next())
			{
				System.out.printf("%-10s%-15s%-15s\n",rs.getRow(),rs.getString("name"),rs.getString("salary"));
			}
			
			
			
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
	}
	
}
