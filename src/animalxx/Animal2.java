package animalxx;

public class Animal2 {

	private int age;
	private double weight; 
	
	
	public Animal2() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal2(int age, double weight) {
		this.age = age;
		this.weight = weight;
	}
	
	public void setAge(int age) {
		this.age = age;	
	}
	
	public int getAge() {
		return age;
	}
	public void setWeight(double weight) {
		this.weight = weight;	
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void speak(){
		System.out.println("年齡為" + age);
		System.out.println("體重為" + weight);
		}
	
	public double getHeight() {
		return 0;
	}
}

