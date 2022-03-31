package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BikeDAOImpl implements BikeDAO {
	public String createBikeData(int bikeNum, String bikeName, String bikeBrand, double bikemilage, String bikecapacity) throws SQLException {
		
		Connection connection = null;
		try {
			String sqlInsertQuery = "insert into jdbc.bikeapp values(?,?,?,?,?);";
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			
			PreparedStatement prepareStatement = connection.prepareStatement(sqlInsertQuery);

			prepareStatement.setInt(1, bikeNum);
			prepareStatement.setString(2, bikeName);
			prepareStatement.setString(3, bikeBrand);
			prepareStatement.setDouble(4, bikemilage);
			prepareStatement.setString(5, bikecapacity);
			
			int noOfRowsInserted = prepareStatement.executeUpdate();
			System.out.println("Done....!");
			System.out.println("noOfRowsInserted : " + noOfRowsInserted);
		} catch (Exception exception) {
			System.out.println("sqlInsertQuery-catch block is executed...!");
		} finally {
			connection.close();
		}
		return "Data is inserted in database...!";
	}
}

//	public String updateBikeData(int bikeNum, String bikeName, String bikeBrand, double bikemilage, String bikecapacity) throws SQLException {
//		
//		Connection connection = null;
//		try {
//			String sqlUpdateQuery = "update jdbc.bikeapp set bikeNum=?, bikeName=?, bikeBrand=?, bikemilage=?, bikecapacity=?, \r\n"
//					+ "bikeprice=?;";
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "9482736775");
//	
//			PreparedStatement prepareStatement = connection.prepareStatement(sqlUpdateQuery);
//			
//			prepareStatement.setInt(1, bikeNum);
//			prepareStatement.setString(2, bikeName);
//			prepareStatement.setString(3, bikeBrand);
//			prepareStatement.setDouble(4, bikemilage);
//			prepareStatement.setString(5, bikecapacity);
//			prepareStatement.setDouble(6, bikeprice);
//			
//			int noOfRowsUpdated = prepareStatement.executeUpdate();
//			System.out.println("Done....!");
//			System.out.println("noOfRowsUpdated : "+noOfRowsUpdated);
//		} catch (Exception exception) {
//			System.out.println("sqlUpdateQuery-catch block is executed...!");
//		} finally {
//			connection.close();
//		}
//		return "Data is updated in database...!";
//	}
//
//	public String deleteBikeData(int bikeNum) throws SQLException {
//		Connection connection = null;
//		try {
//			String sqlDeleteQuery = "delete from jdbc.bikeapp where bikeNum=?;";
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "9482736775");
//			
//			PreparedStatement prepareStatement = connection.prepareStatement(sqlDeleteQuery);
//			prepareStatement.setInt(1, bikeNum);
//			
//			int noOfRowDeleted = prepareStatement.executeUpdate();
//			System.out.println("Done....!");
//			System.out.println("noOfRowDeleted : "+noOfRowDeleted);
//		} catch (Exception exception) {
//			System.out.println("sqlDeleteQuery-catch block is executed...!");
//		} finally {
//			connection.close();
//		}
//		return "Data from database is deleted...!";
//		
//	}
//		
//}
//
