package dynamicpreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class InsertTbvalues 
{
public static void main(String[] args) throws Exception 
{
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase","root","root");
	PreparedStatement pt = con.prepareStatement("insert into jspiders values(?,?,?)");
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the id ");
	pt.setInt(1,sc.nextInt());
	System.out.println("enter the name");
	pt.setString(2, sc.next());
	System.out.println("enter the address");
	pt.setString(3,sc.next());
	pt.executeUpdate();
}
}
