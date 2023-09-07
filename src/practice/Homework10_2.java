package practice;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Homework10_2 {

//		請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位
//		(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖 (提示： TestFormatter.java, Java API
//		文件, 判斷數字可用正規表示法)
//		• 補充 (依此類推)：
//		輸入12345，千分位為12,345，輸入123，千分位為123
//		輸入0.75，百分比為75%，輸入1，結果為100%

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字");
		String num = sc.next();
		String regex = "^[-]?+\\p{Digit}++(.)?+\\p{Digit}*+$";
		
		while (!num.matches(regex)) {
			System.out.println("數字格式不正確，請再次輸入一次!");
			System.out.println("請輸入數字:");
			num = sc.next();
		}

		System.out.println("欲格式化(1)千分位(2)百分比(3)科學記號");
		Double dN = Double.parseDouble(num);
		int type = sc.nextInt();
		switch (type) {
		case (1):
			Format dfm1 = new DecimalFormat("#,###.00");
			System.out.println(dfm1.format(dN));
			break;
		case (2):
			Format dfm2 = new DecimalFormat("#00%");
			System.out.println(dfm2.format(dN));
			break;
		case (3):
			Format dfm3 = new DecimalFormat("0.###E0");
			System.out.println(dfm3.format(dN));
			break;
		}
	}
}


