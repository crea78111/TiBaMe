package animalxx;

public class AnimalPractice {
	private int age;
	private float weight;
	
	public AnimalPractice(int age, float weight) {
		this.age = age;
		this.weight = weight;
		}
	
	public void speak() {
		System.out.println("You age is =" + age);
		System.out.println("And your weight is =" + weight);
	}
	
	public void setAge(int age) {
		this.age = age; 
	}
	
	public int getAge(int age) {
		return age; 
	}
	
	public void setWeight(float weight) {
		this.weight = weight; 
	}
	
	public float getWeight(float weight) {
		return weight; 
	}
}
