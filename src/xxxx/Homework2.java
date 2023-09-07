package xxxx;

public class Homework2 {

	public Homework2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	//• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

	int sum = 0;
	for (int n = 0; n <= 1000; n++) {
		if (n % 2 == 0)
			sum += n;

	}
	System.out.print("1~1000的偶數和為= " + sum + '\n');
	System.out.println("---------------------------");
	//• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

	int sum1 = 1;
	int m = 1;
	for (m = 1; m <= 10; m++) {
		sum1 *= m;// sum = sum * m

	}
	System.out.print("1~10的連乘積為= " + sum1 + '\n');
	System.out.println("---------------------------");
	

	//• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		
	int sum2 = 1;
	int a = 1;
	while(a <= 10) {
		sum2 *= a ;
		a++;
		
		}System.out.print("1~10的連乘積為= " + sum2 + '\n');
		System.out.println("---------------------------");
	
	//• 請設計一隻Java程式,輸出結果為以下:
	//1 4 9 16 25 36 49 64 81 100
	
	int b = 0;
	for(int c = 1; c <= 19; c += 2) { 
		b += c;//b = b + c  
		System.out.printf(b + " ");   
		
	}System.out.println(); 
	System.out.println("---------------------------");
	
	//• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
	//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	System.out.println("阿文可選擇的數字");
	for (int f = 1; f <= 39; ++f) {
		if (f % 10 == 4) {// 除以10餘數為4的也要排除 14,24,34
			continue;
		}
		System.out.print(f + " ");

	}
	System.out.println();
	System.out.println("總共35個");
	System.out.println("---------------------------");
	
	//• 請設計一隻Java程式,輸出結果為以下:
	//1 2 3 4 5 6 7 8 9 10
	//1 2 3 4 5 6 7 8 9
	//1 2 3 4 5 6 7 8
	//1 2 3 4 5 6 7
	//1 2 3 4 5 6
	//1 2 3 4 5
	//1 2 3 4
	//1 2 3
	//1 2
	//1
	
	for (int i = 11; i >= 1; i--) {
		for (int w = 1; w < i; w++) {
			System.out.print(w + " ");

		}
		System.out.println();
		}
		System.out.println("---------------------------");

		// • 請設計一隻Java程式,輸出結果為以下:
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF

		for (char x = 'A'; x <= 'F'; x++) {
			for (char y = 'A'; y <= x; y++)
				System.out.print(x);
			System.out.println();
		}

	}
}
