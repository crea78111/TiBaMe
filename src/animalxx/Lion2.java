package animalxx;

public class Lion2 extends Elephant2{
	private String color;
	
	public Lion2() {
		// TODO Auto-generated constructor stub
	}
	
	public Lion2(int age, double weight, double height, String color) {
		super(age, weight, height);
		this.color = color; 
	}
	
	public void speak() {
		super.speak();
		System.out.println("顏色為" + color);
	}
	
	public double getHeight() {
		return super.height;
	}
}
//public double getSalary() {
////	double monthlySalary = super.getSalary();
////	return monthlySalary + bonus;
//	return super.getSalary() + bonus;