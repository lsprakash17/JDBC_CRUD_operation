package dynamicpreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Deletevalues 
{
public static void main(String[] args) throws Exception 
{
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase","root","root");
	PreparedStatement pt = con.prepareStatement("delete from jspiders where SID=?");
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the ID to delete from Table");
	pt.setInt(1,sc.nextInt());
	pt.executeUpdate();
	con.close();
	sc.close();
}
}
