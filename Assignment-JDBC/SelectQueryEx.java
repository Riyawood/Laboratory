package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectQueryEx {

	public static void main(String[] args) 
	{
//		try(Connection conn=DatabaseConnection.getConnection())
//		{
//			String sql = "select * from teacher";
//		
//			PreparedStatement pst = conn.prepareStatement(sql);
//			ResultSet resultSet = pst.executeQuery();
//			
//			while(resultSet.next()) //result set next method
//			{
//				System.out.println("Teacher ID: "+resultSet.getInt(1)); // get int column index
//				System.out.println("Teacher Name: "+resultSet.getString("name")); //get string column name
//				System.out.println("Teacher Email: "+resultSet.getString(3)); //get string column index
//				System.out.println("Teacher Salary: "+resultSet.getInt("salary")); // get int column name
//				System.out.println("===========================================");
//			}
//		}
        try(Connection conn=DatabaseConnection.getConnection();
		         Scanner sc = new Scanner(System.in))
        {
			String sql = "select * from teacher where id=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			System.out.println("Enter id: ");
            int id = sc.nextInt();
            
            ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
            	System.out.println("Teacher ID: "+rs.getInt(1)); // get int column index
				System.out.println("Teacher Name: "+rs.getString("name")); //get string column name
				System.out.println("Teacher Email: "+rs.getString(3)); //get string column index
				System.out.println("Teacher Salary: "+rs.getInt("salary")); // get int column name
				System.out.println("===========================================");
            }
            else
            {
            	System.out.println("ID not present");
            }
        }
        catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
