package xxxx;

public class TestBMI {

	public TestBMI() {
	}

	public static void main(String[] args) {
//		System.out.println("Please enter your weight in kg: ");
//	
//		System.out.println("Please enter your height in m: ");
		
		double weight = 80.0;
		double height = 171; 
		double height2 = height / 100;
		
		double bmi = weight / (height2 * height2);
		System.out.printf("BMI值= %.2f%n", bmi);
		
		if (bmi < 18.5) {
			System.out.print("過瘦");
		}
		
		else if (bmi > 24) {
			System.out.print("過胖");
		}
		
		else {
			System.out.print("正常");
		}

	}

}
