package animalxx;

public class Elephant2 extends Animal2 {
	protected double height;
	
	public Elephant2() {
		// TODO Auto-generated constructor stub
	}

	public Elephant2(int age, double weight, double height) {
		super(age, weight);
		this.height = height;
	}
	
	public void speak() {
		super.speak();
		System.out.println("身高為" + height);
	}

	public double getHeight() {
		return height;
	}
}

