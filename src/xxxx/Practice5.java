package xxx;

import java.util.Scanner;

public class Practice5 {

		public static void main(String[] args) {
//			for(int i = 1; i < 5; i++){
//				for(int j = 1; j <= i; j++) {
//					
//				}
//			}
			
//			Scanner sc = new Scanner(System.in);
//			int i,j;
//			
//			i = sc.nextInt();
//			j = sc.nextInt();
//			
//			System.out.println(i + "+" + j + "=" + (i+j));
		
			
//			public static void daycalculate(int year, int month, int day) {
//				Scanner sc = new Scanner(System.in);
//				int todays = 0;
//				int[] normalyear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//				int[] leapyear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//				if (year % 4 != 0) { // 不被4整除 平年
//					for (int i = 0; i < month - 1; i++) {
//						todays += normalyear[i];
//					}
//					todays += day;
//				} else if (year % 100 != 0) { // 被4整除 不被100整除 閏年
//					for (int i = 0; i < month - 1; i++) {
//						todays += leapyear[i];
//					}
//					todays += day;
//				} else if (year % 400 != 0) { // 被4整除 被100整除 不被400整除 平年
//					for (int i = 0; i < month - 1; i++) {
//						todays += normalyear[i];
//					}
//					todays += day;
//				} else { // 被4整除且 被100整除，且 被400整除 閏年
//					for (int i = 0; i < month - 1; i++) {
//						todays += leapyear[i];
//					}
//					todays += day;
//				}
//				System.out.println(todays);
				
//			int[][] data = { { 10, 35, 40, 100, 90, 85, 75, 70 }, 
//							 { 37, 75, 77, 89, 64, 75, 70, 95 },
//							 { 100, 70, 79, 90, 75, 70, 79, 90 }, 
//							 { 77, 95, 70, 89, 60, 75, 85, 89 },
//							 { 98, 70, 89, 90, 75, 90, 89, 90 }, 
//							 { 90, 80, 100, 75, 50, 20, 99, 75 } };
//			
//			int[] count = new int[8];
//			
//			int highScore, studentIndex;
//			
//			for (int i = 0; i < data.length; i++) {
//				highScore = data[i][0];
//				studentIndex = 0;
//				for (int j = 1; j < data[i].length; j++) {
//					if (highScore < data[i][j]) {
//						highScore = data[i][j];
//						studentIndex = j;
//					}
//				}
//				count[studentIndex]++;
//			}
//			for (int i = 0; i < count.length; i++) {
//				System.out.println(i + 1 + "號學生 考最高的次數為: " + count[i] + " 次");
//			}
			
			//有個一維陣列如下：
			//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
			//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
			//(提示：陣列，length屬性)

			int array [ ] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
			int avg = 0;
			for (int i = 0; i < array.length; i++) {
				avg += array[i];
			}
			System.out.print("平均數:"+(avg = avg / array.length));
			System.out.print("\n大於平均值的數:");
			for (int i = 0; i < array.length; i++) {
				if (array[i] > avg)
				System.out.print(array[i] + " ");	
			}
		}
	}
