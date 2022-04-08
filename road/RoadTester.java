package com.xworkz.road;

import java.util.Scanner;

public class RoadTester {

	public static void main(String[] args) {
		RoadEntity Entity = new RoadEntity();

		RoadDAOImp roadDAOImp = new RoadDAOImp();
		Scanner scanner = new Scanner(System.in);

		Entity.setRoadId(scanner.nextInt());
		Entity.setType(scanner.next());
		Entity.setName(scanner.next());
		Entity.setServices(scanner.nextInt());
		roadDAOImp.createData(Entity);
		// roadDAOImp.updateData(Entity);
		int roadId = scanner.nextInt();

		roadDAOImp.deleteData(roadId);
		// roadDAOImp.getData();

	}

}
