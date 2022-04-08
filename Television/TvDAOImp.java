package Television;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.Statement;

public class TvDAOImp implements TvDAOInterface {

	@Override
	public void saveData(TvEntity tvEntity) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tv", "root", "root");
			if (connection != null) {
				Statement createStatement = (Statement) connection.createStatement();
				String insertQuery = ("insert into tv.tv values('sony',10000,2);");
				System.out.println(tvEntity.getName());
				System.out.println(tvEntity.getPrice());
				System.out.println(tvEntity.getWarranty());
				// System.out.println(noOfRowsAffected);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public void upadate(TvEntity tvEntity) {
		System.out.println("update method is invoked..");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tv", "root", "root");
			if (connection != null) {
				System.out.println(connection.hashCode());
				PreparedStatement prepareStatement = connection
						.prepareStatement("update tv.tv set name=?  price=? where tvId=?;");
				prepareStatement.setString(2, tvEntity.getName());
				prepareStatement.setInt(3, tvEntity.getPrice());
				prepareStatement.setInt(1, tvEntity.getTvid());
				System.out.println(prepareStatement);
				prepareStatement.executeUpdate();
				connection.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void delete(int price1) {
		System.out.println("delete method is invoked.......");
		Connection connection1 = null;
		try {
			connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/tv", "root", "root");
			if (connection1 != null) {

				PreparedStatement prepareStatement = connection1.prepareStatement("delete from tv.tv where price=?;");
				prepareStatement.setInt(1, price1);
				prepareStatement.executeUpdate();

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void getData() {
		System.out.println("");

	}

	public void upadate(String type, int price) {
		// TODO Auto-generated method stub

	}
}
