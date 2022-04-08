package com.xworkz.chair;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ChairImpl implements ChairDAO {

	public  void saveDate(ChairEntity chairentity) {
		System.out.println(" calling ChairEntity ");
		//String insertQuery="insert into jdbbc.chair values(?,?,?,?,?);";//
	     Connection connection = null;
		try
		{
			System.out.println("calling try block");
			
		connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbbc", "root", "root");
	if (connection !=null) {
		PreparedStatement prepareStatement=connection.prepareStatement("insert  into jdbbc.chair values(?,?,?,?,?);");
		//int noOfRowsAffected=createStatement.executeUpdate("insert into jdbbc.chair values(10,'ashu','350','cream','wooden');");
	//	System.out.println(chairentity.p//
				
//				
//		System.out.println(chairentity.getBrand());
//		System.out.println(chairentity.getPrice());
//		System.out.println(chairentity.getColor());
//		System.out.println(chairentity.getType());
//		System.out.println(noOfRowsAffected);
//	}
		prepareStatement.setInt(1, chairentity.getSl_no());
		prepareStatement.setString(2, chairentity.getBrand());
		prepareStatement.setInt(3, chairentity.getPrice());
		prepareStatement.setString(4, chairentity.getColor());
		prepareStatement.setString(5, chairentity.getType());
		prepareStatement.executeUpdate();
	}
	
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		finally {
			if (connection !=null) {
				try {
					System.out.println("try block is invoking");
					connection.close();
					
				}
				catch(Exception exception) {
					System.out.println("exception");
				}
				System.out.println("connection is Done");
			}
			else {
				System.out.println("connection is not Done");
			}
			}
			
		}
		
		
		
	
		
		
		
		
	
	@Override
	public void update(ChairEntity chairentity) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ChairEntity chairentity) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDate() {
		// TODO Auto-generated method stub
		
	}

	

	
	}

	

	