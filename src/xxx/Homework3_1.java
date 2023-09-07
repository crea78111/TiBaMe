package xxx;

import java.util.Scanner;

public class Homework3_1 {

	public Homework3_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		第一題  請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三邊長:");	
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		
		if(a == b && b == c) {
			System.out.println("我是正三角形");
		}else if((a + b) < c || (a + b) < c||(b + c) < a) {
			System.out.println("我不是三角形");
		}else if(a == b || b == c) {
			System.out.println("我是等腰三角形");
		}else {
			System.out.println("我是其他三角形");
		}
	
	}

}
