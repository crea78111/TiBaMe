package xxx;

public class InkBrush extends Pen{

	public InkBrush() {
		// TODO Auto-generated constructor stub
	}

	public InkBrush(String brand, int price) {
		super(brand, price);
	}
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public void setPrice(int price) {
		super.setPrice((int)(price* 0.9));
	}
}
