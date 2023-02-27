package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateQuery
{
	public static void main(String[] args)
    {
		try(Connection con= DatabaseConnection.getConnection();
				Scanner sc= new Scanner(System.in))
		{
			System.out.println("Enter name to update:");
			String name= sc.nextLine();
			
			System.out.println("Enter email to update:");
			String email= sc.nextLine();
			
			System.out.println("Enter salary to update:");
			int sal= sc.nextInt();
			
			String query= "update teacher set name='"+name+"',email='"+email+"',"
			       + "salary='"+sal+"' where id=?";
			
			PreparedStatement ps= con.prepareStatement(query);
			
			System.out.println(("Enter id:"));
			int id= sc.nextInt();
			
			ps.setInt(1, id);
			int row= ps.executeUpdate();
			System.out.println(row+" Record update successfully!!");
			
			System.out.println();
			String query1= "select * from teacher  where id='"+id+"'";
			PreparedStatement ps1= con.prepareStatement(query1);
			
			ResultSet rs= ps1.executeQuery();
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
