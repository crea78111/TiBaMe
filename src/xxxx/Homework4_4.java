package xxxx;

import java.util.Scanner;

public class Homework4_4 {

	public Homework4_4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
		
		int arr1[][] = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入想要借多少錢");
		int money = sc.nextInt();
		System.out.print("小華想要借" + money);
		System.out.println("\n" + "有錢可借的員工編號:");
		int count = 0;
		int j = 0;
			for (j = 0; j < arr1[1].length; j++) {
				if (arr1[1][j] >= money) {
					count += 1;
					System.out.print(arr1[0][j] + " ");	
				}
			
		}System.out.printf("\n共有%d個人可以借",count);

	}

}
