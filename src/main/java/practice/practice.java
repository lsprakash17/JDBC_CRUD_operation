package practice;

import java.sql.*;

import dynamicpreparedStatements.prepStatement;

public class practice 
{
public static void main(String[] args) throws Exception 
{
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
    
    Statement s=con.createStatement();
Boolean b= s.execute("CREATE DATABASE PRACTICE");
System.out.println(b);
}
}
