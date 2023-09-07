package xxx;

import java.util.Scanner;

public class Homework5_1 {

	public Homework5_1() {
	
	}
//	請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//	圖：
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//import Scanner
		System.out.print("請輸入兩個數字代表寬跟高");
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		starSquare(width, height);

	}
	public static void starSquare(int width, int height) {
		int i, j;
		for(i = 0; i < height; i++){
			for(j = 0; j < width; j++) {
				System.out.print("*");
				
			}System.out.println();
		}
		
	}
	
}


