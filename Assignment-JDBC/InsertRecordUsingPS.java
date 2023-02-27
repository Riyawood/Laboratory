package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordUsingPS
{
	public static void main(String[] args) 
	{
		//try with resource
		try(Connection con=DatabaseConnection.getConnection();
		         Scanner sc = new Scanner(System.in))
		{
			String sql= "Insert into teacher value(?,?,?,?)"; //inserting record using prepared statement
			
			PreparedStatement ps =con.prepareStatement(sql);
			
			System.out.println("Enter id:");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter name:");
			String name = sc.nextLine();
			
			System.out.println("Enter email:");
			String email = sc.nextLine();
			
			System.out.println("Enter salary:");
			int salary = sc.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, salary);
			
			int row = ps.executeUpdate(); //execute update for insert query
			System.out.println(row+ " record inserted successfully!!");
		    
			System.out.println();
		    String query = "select * from teacher where id='"+id+"'";
		    PreparedStatement ps1 = con.prepareStatement(query);
		    
		    ResultSet rs=ps1.executeQuery();
		    if(rs.next())
		    {
		    	System.out.println("Teacher ID: "+rs.getInt(1)); // get int column index
				System.out.println("Teacher Name: "+rs.getString("name")); //get string column name
				System.out.println("Teacher Email: "+rs.getString(3)); //get string column index
				System.out.println("Teacher Salary: "+rs.getInt("salary")); // get int column name
				System.out.println("===========================================");
		    }
		    else
		    	System.out.println("Id not found!!");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
