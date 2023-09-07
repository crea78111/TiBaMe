package xxxx;

public class Homework10_1 {

	public static void main(String[] args) {
//		• 請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
//		為質數 (提示：Math類別)
		for(int i = 0; i < 5; i++) {
			int number = (int)(Math.random()*100 + 1);
			boolean isPrime = isPrimeNumber(number);
			
			System.out.println("隨機整數" + number + "是否為直數" + isPrime);
		}
	}
	
	
	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
		return false;
		}

		if (num <= 3) {
			return true;
		}
		
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		
		for(int i = 5; i * i <= num; i += 6) {
			if(num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return false;
	}

}
