package xxxx;

import java.util.Scanner;

public class Homework3_3 {

	public Homework3_3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		第三題 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
		
		int[] array = new int[49];
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("請輸入不喜歡的數字(1~9):");	
		
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


