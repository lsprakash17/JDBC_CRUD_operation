package dynamicpreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDynamical {
	public static void main(String[] args) throws Exception {
	{
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase","root","root");
		PreparedStatement pt = con.prepareStatement("update jspiders set address=? where SID=4");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the address");
		pt.setString(1,sc.next());
		pt.executeUpdate();
	}

}
}
