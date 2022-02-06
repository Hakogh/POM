package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databasepage {
	String columValue = null;
	Connection connection = null;
	Statement statement = null;
	 ResultSet rs = null;
	 //List<String> datalist = new ArrayList<String>():
	 //when we have list we put datalist in while loop
	public String getData(String columnLabel) throws SQLException {
		
		try {
			//setting properties for my sql
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl ="jdbc:mysql://127.0.0.1:3306/techfios";
			String sqlUsername="root";
			String sqlPassword="root";
			String query="select * from users";
			
			//create local connection to database
			 connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
			
			//empowering connection reference variable to excute queries
			 statement = connection.createStatement();
			
			//delivering the query
			  rs = statement.executeQuery(query);
			 
			 while (rs.next()) {
				String columValue =rs.getString(columnLabel);
				 return columValue;
			 }
			
		
		}catch(Exception e) {
		e.printStackTrace();	
		}finally {
			
			if(rs!=null) {
				rs.close();
			}
			if(connection != null) {
				connection.close();
			}
		}
		
		return columValue;
	}
}
