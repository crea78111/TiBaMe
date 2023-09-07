package xxxx;

public class Homework5_2 {

	public Homework5_2() {
		// TODO Auto-generated constructor stub
	}
//	• 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：

	public static void main(String[] args) {
		System.out.print("請從10個亂數中取出平均值，並列印出這10個亂數" + "\n");
		randAvg();
	}	

	public static void randAvg() {
		int sum = 0;
		int avg = 0;
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = (int)(Math.random()*101);
			System.out.print(array[i] + " ");
			sum += array[i];
			avg = sum / array.length;
		
		}System.out.print("\n平均值為" + avg);
	
	}

}