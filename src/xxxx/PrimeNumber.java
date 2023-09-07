package xxx;

public class PrimeNumber {

	public PrimeNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		• 請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
//		為質數 (提示：Math類別)
		for(int i = 0; i < 5; i++) {
			int number = (int)(Math.random()*100 + 1);
			boolean isPrime = isPro(number);
			
			System.out.println("隨機整數" + number + "是否為直數" + isPrime);
		}
	}
	
	}

}
