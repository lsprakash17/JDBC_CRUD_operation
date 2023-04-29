package practice;

import java.sql.*;
import java.util.Scanner;

public class Encryption 
{
public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/PRACTICE","root","root");
	 PreparedStatement pt= con.prepareStatement("insert into prctc values(?,?)");
	 System.out.println("enter id");
	 pt.setString(1, sc.next());
	 System.out.println("enter the password");
	 String n=sc.next();
	 System.out.println("enter the secret key");
	 String s=sc.next();
	 pt.setString(2, AES.encrypt(s, n));
	 pt.execute();
	 con.close();
	 
}
}
