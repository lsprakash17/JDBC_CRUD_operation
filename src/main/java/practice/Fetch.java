package practice;

import java.sql.*;
import java.util.Scanner;

public class Fetch 
{
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/PRACTICE","root","root");
		 PreparedStatement pt= con.prepareStatement("select * from prct");
		 ResultSet r=pt.executeQuery();
		 while(r.next())
		 {
			System.out.println( (r.getString(1)));
			System.out.println("enter secret key");
			System.out.println(AES.decrypt(r.getString(2), sc.next()));
		 }
}
}