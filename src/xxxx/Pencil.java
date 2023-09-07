package xxxx;

public class Pencil extends Pen{

	public Pencil() {
		
	}
	
	public Pencil(String brand, int price) {
		super(brand, price);
	}
	
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public void setPrice(int price) {
		super.setPrice((int) (price* 0.8));
	}

}
