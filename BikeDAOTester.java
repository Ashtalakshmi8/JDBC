package com.xworkz.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class BikeDAOTester {
	public static void main(String[] args) throws SQLException {

		BikeDAOImpl bikeDAOImpl = new BikeDAOImpl();
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("INSERTION");
			System.out.println("Enter Bike number: ");
			int bikeNum = scanner.nextInt();

			System.out.println("Enter Bike Name: ");
			String bikeName = scanner.next();

			System.out.println("Enter Bike Brand: ");
			String bikeBrand = scanner.next();

			System.out.println("Enter Bike Milage: ");
			double bikemilage = scanner.nextDouble();

			System.out.println("Enter Bike Capacity: ");
			String bikecapacity = scanner.next();

			
			String result = bikeDAOImpl.createBikeData(bikeNum, bikeName, bikeBrand, bikemilage, bikecapacity);
			System.out.println(result);

//			System.out.println("UPDATION");
//			System.out.println("Enter new Bike number: ");
//			int bikeNum1 = scanner.nextInt();
//
//			System.out.println("Enter new Bike Name: ");
//			String bikeName1 = scanner.next();
//
//			System.out.println("Enter new Bike Brand: ");
//			String bikeBrand1 = scanner.next();
//
//			System.out.println("Enter new Bike Milage: ");
//			double bikemilage1 = scanner.nextDouble();
//
//			System.out.println("Enter new Bike Capacity: ");
//			String bikecapacity1 = scanner.next();
//
//			System.out.println("Enter new Bike Price: ");
//			double bikeprice1 = scanner.nextDouble();
//
//			
//			String updateResult = bikeDAOImpl.updateBikeData(bikeNum1, bikeName1, bikeBrand1, bikemilage1, bikecapacity1,bikeprice1);
//			System.out.println(updateResult);
//
//			System.out.println("DELETION");
//			System.out.println("Enter the bikeNum : ");
//			int bikeNum2 = scanner.nextInt();
//			String deleteQueryResult = bikeDAOImpl.deleteBikeData(bikeNum2);
//			System.out.println(deleteQueryResult);

		} catch (Exception exception) {
			System.out.println("Exception in main class....!");
		} finally {
			scanner.close();
		}

	}


}
