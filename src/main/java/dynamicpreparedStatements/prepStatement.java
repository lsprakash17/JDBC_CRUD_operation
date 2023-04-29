package dynamicpreparedStatements;
import java.sql.*;
public class prepStatement 
{
public static void main(String[] args) throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase","root","root");
	Statement st=con.createStatement();
	boolean b=st.execute("create table jspiders(SID integer primary key,Name varchar(20),address varchar(20))");
	System.err.println(b);
	System.out.println("created");
	
	con.close();
}
}
