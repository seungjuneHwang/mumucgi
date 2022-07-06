package dto;

public class Menu {
	// 데이터 베이스에 정보
	// 변수
	private int id;
	private String menu;
	private int price;
	
	// 메소드
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
