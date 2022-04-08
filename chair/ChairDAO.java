package com.xworkz.chair;

import java.sql.SQLException;

public interface ChairDAO {
	public void saveDate(ChairEntity chairentity )throws SQLException;
	public void update(ChairEntity chairentity )throws SQLException;
	 public void delete(ChairEntity chairentity )throws SQLException;
	public void getDate();
}
