package com.xworkz.jdbc;
import java.sql.SQLException;
public interface BikeDAO {
String createBikeData(int bikeNum,String bikeName,String bikeBrand,double bikemilage,String bikecapacity) throws SQLException;
//				
//				String updateBikeData(int bikeNum,String bikeName,String bikeBrand,double bikemilage,String bikecapacity,double bikeprice) throws SQLException;
//				
//				String deleteBikeData(int bikeNum) throws SQLException;
	}