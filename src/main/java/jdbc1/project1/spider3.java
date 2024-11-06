package jdbc1.project1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class spider3 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/monday","root","root");
		CallableStatement p = c.prepareCall("insert into emp values(3,'bb',9885563562)");
		int e = p.executeUpdate();
		System.out.println(e);
		c.close();
	}
}

