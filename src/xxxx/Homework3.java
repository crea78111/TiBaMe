package xxxx;

import java.util.Scanner;
import java.util.Arrays;  

public class Homework3 {

	public Homework3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
////		第一題  請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
////		三角形、其它三角形或不是三角形,如圖示結果:
//		
//		int[] x = new int[3];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入三邊長:");	
//		
//		if(sc.hasNextInt()) {
//			x[0] = sc.nextInt();
//			x[1] = sc.nextInt();
//			x[2] = sc.nextInt();
//		}
//		
//		if(x[0] == x[1] && x[1] == x[2]) {
//			System.out.println("我是正三角形");
//		}else if(x[0] == x[1] || x[1] == x[2]) {
//			System.out.println("我是等腰三角形");
//		}else if((x[0] + x[1]) > x[2] || (x[0] + x[2]) > x[1] ||(x[1] + x[2]) > x[3]) {
//			System.out.println("我不是三角形");
//		}else {
//			System.out.println("我是其他三角形");
//		}
//	
//		
//		第二題 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
		
		
		int answer = (int)(Math.random()*10);
		
		int j = 0;
		
		Scanner num1 = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		if(num1.hasNextInt()) {
			j = num1.nextInt();
		}
		
		if (answer == j) {
			System.out.println("猜對囉!答案就是:" + answer);
		}else{
			System.out.println("猜錯囉");
		}
		
//		第三題 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
		
		int[] array = new int[49];
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("請輸入不喜歡的數字:");	
		
		int a = 0; int count = 0;
		
		if (sc1.hasNextInt()) {
			a = sc1.nextInt();
			if (a > 0 && a < 10) {

				for (int i = 1; i < array.length; i++) {
					if ((i % 10 != a) && (i / 10 != a)) {
						System.out.print((array[count++] = i) + " ");
					}	
				}
				System.out.println("\n總共有" + count + "個數字可選");
			}
		}
	}
}
