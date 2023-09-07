package xxxx;

import java.util.Scanner;

public class Homework4 {

	public Homework4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		• 有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性
//		System.out.println("我是第一題");
//		int array[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//
//		int i = 0;
//		int sum = 0;
//		int average = 0;
//		for (i = 0; i < array.length; i++) {
//			sum += array[i];
//			average = sum / array.length;
//		}
//		System.out.print("平均值為" + average);
//
//		System.out.println("\n大於平均值的元素為");
//		for (i = 0; i < array.length; i++) {
//			if (array[i] > average) {
//				System.out.print(array[i]+ " ");
//				
//			}
//			System.out.println(" ");
//		}
//	• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)
//		System.out.println("\n我是第二題");
//		String a = "Hello World";
//		for(int j = a.length()-1; j >= 0; j--) {
//			System.out.print(a.charAt(j));
//		}
	
	
//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
//		System.out.println("\n我是第三題");
//		String array1[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//		int vowel = 0;
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length(); j++) {
//				switch (array[i].charAt(j)) {
//				case 'a':
//					vowel += 1;
//					break;
//				case 'e':
//					vowel += 1;
//					break;
//				case 'i':
//					vowel += 1;
//					break;
//				case 'o':
//					vowel += 1;
//					break;
//				case 'u':
//					vowel += 1;
//					break;
//				}
//			}
//		}
//		
//		System.out.println("在八大行星中，母音共有" + vowel + "個");

//		• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
		
//		int arr1[][] = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
//
//		Scanner sc = new Scanner(System.in);
//		int money = sc.nextInt();
//		System.out.print("小華想要借" + money);
//		System.out.println("\n" + "有錢可借的員工編號:");
//		int count = 0;
//		int j = 0;
//			for (j = 0; j < arr1[1].length; j++) {
//				if (arr1[1][j] >= money) {
//					count += 1;
//					System.out.println(arr1[0][j]);	
//				}
//			
//		}System.out.printf("共有%d個人可以借",count);
		
//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		
//		西元年份除以4不可整除，為平年。
//		西元年份除以4可整除，且除以100不可整除，為閏年。
//		西元年份除以100可整除，且除以400不可整除，為平年
//		西元年份除以400可整除，為閏年。
		
//		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
//		
//		System.out.print("請輸入三個整數:西元年、月、日");
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
//		int month = sc.nextInt();
//		int day = sc.nextInt();
//		
//		
//		System.out.printf("輸入的日期為該年第");	
//		if(month == 2 && day >= 29) {
//			System.out.print("2月只有28天喔!");
//		}else {
//			int count = 0;
//			for(int i = 0; i <= (month - 1); i++) {
//				count += days[i];
//				} if(year % 4 ==0 || (year % 4 == 0 && year % 100 != 0)|| (year % 100 == 0 && year % 400 ==0)||year % 400 == 0) {
//					count++;	
//			}System.out.print(count + "天");	
//		}

		
//		 班上有8位同學，他們進行了6次考試結果如下：
//		 請算出每位同學考最高分的次數
		
//		int[][] score = {
//				{10, 35, 40, 100, 90, 85, 75, 70},
//				{37, 75, 77, 89, 64, 75, 70, 95},
//				{100, 70, 79, 90, 75, 70, 79, 90},
//				{77, 95, 70, 89, 60, 75, 85, 89},
//				{98, 70, 89, 90, 75, 90, 89, 90 },
//				{90, 80, 100, 75, 50, 20, 99, 75}};
//		
//		int[] array = new int[8];
//		int highscore, newhighscore;
//		for (int i = 0; i < score.length; i++) {
//			highscore = score[i][0];
//			newhighscore = 0;
//			for (int j = 1; j < score[i].length; j++) {
//				if (highscore < score[i][j]) {
//					highscore = score[i][j];
//					newhighscore = j;
//				}
//			}
//			array[newhighscore]++;
//		}
//			for (int i = 0; i < array.length; i++) {
//				System.out.println("第" + (i + 1) + "位同學考最高的分數次數為:" + array[i]);
//			}
		


}
}


