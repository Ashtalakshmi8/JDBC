package Television;

import java.util.Scanner;

public class TvTester {
	public static void main(String[] args, TvEntity TvEntity) {
		Scanner scanner = new Scanner(System.in);
		TvEntity tvEntity=new TvEntity();
		TvDAOImp tvDAOImp = new TvDAOImp();
		tvEntity.setTvid(scanner.nextInt());
		tvEntity.setName(scanner.next());
		tvEntity.setPrice(scanner.nextInt());
		tvEntity.setWarranty(scanner.next());
		//tvDAOImp.saveData(tvEntity);
		tvDAOImp.upadate(tvEntity);
		//.delete(price);
	}

}

