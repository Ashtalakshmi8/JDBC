package Television;

public class TvEntity {
	private int tvid;
	private String name;
	private int price;
	private String warranty;
	
	TvEntity(){
		
	}
	public int getTvid() {
		return tvid;
	}
	public void setTvid(int tvid) {
		this.tvid = tvid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	
	
	
}