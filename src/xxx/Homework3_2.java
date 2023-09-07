package xxx;

import java.util.Scanner;

public class Homework3_2 {

	public Homework3_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		第二題 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
		
		
		int answer = (int)(Math.random()*10);
		
		int j = 0;
		
		Scanner num1 = new Scanner(System.in);
		System.out.println("開始猜數字吧!(0~9)");
		if(num1.hasNextInt()) {
			j = num1.nextInt();
		}
		
		if (answer == j) {
			System.out.println("猜對囉!答案就是:" + answer);
		}else{
			System.out.println("猜錯囉");
		}

	}

}
