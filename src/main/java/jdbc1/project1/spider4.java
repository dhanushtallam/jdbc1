package jdbc1.project1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class spider4{
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/monday","root","root");
		CallableStatement p = c.prepareCall("select * from emp");
		ResultSet e = p.executeQuery();
		while(e.next())
		{
			System.out.println(e.getInt(1)+" "+e.getString(2)+" "+e.getLong(3));
		}
		
		c.close();
	}
}

