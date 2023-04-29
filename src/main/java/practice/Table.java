package practice;

import java.sql.*;

public class Table 
{
public static void main(String[] args) throws Exception 
{
 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/PRACTICE","root","root");
Statement st=con.createStatement();
 boolean b=st.execute("create table prct(id varchar(20) primary key,password varchar(50))");
 
 System.out.println(b);
 
   
}
}
