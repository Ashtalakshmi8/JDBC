package Television;

public interface TvDAOInterface {

	public void saveData(TvEntity tvEntity);

	public void upadate(TvEntity tvEntity);

	public void delete(int price);

	public void getData();
}