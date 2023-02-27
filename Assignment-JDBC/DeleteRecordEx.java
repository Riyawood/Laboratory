package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecordEx
{
	public static void main(String[] args) 
	{
		try(Connection conn=DatabaseConnection.getConnection();
		Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			
			String sql ="delete from teacher where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			int row = ps.executeUpdate();
			
			if(row==0)
			{
				System.out.println("ID not found!!");
			}
			else
			{
				System.out.println(row+" ID deleted successfully!");
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
