package jdbc1.project1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class spider2 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/monday","root","root");
		CallableStatement p = c.prepareCall("create table emp(eid int primary key,ename varchar(20),ephno bigint )");
		boolean e = p.execute();
		System.out.println(e);
		c.close();
	}
}
