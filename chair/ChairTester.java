package com.xworkz.chair;

import java.sql.SQLException;
import java.util.Scanner;

public class ChairTester {
public static void main(String[] args) throws SQLException {
	Scanner scanner =new Scanner(System.in);
	ChairEntity chairentity=new ChairEntity();
	ChairImpl chair =new ChairImpl();
	
	chairentity.setSl_no(scanner.nextInt());
	chairentity.setBrand(scanner.next());
	chairentity.setPrice(scanner.nextInt());
	chairentity.setColor(scanner.next());
	chairentity.setType(scanner.next());
	
	chair.saveDate(chairentity);
	
}



	
}

