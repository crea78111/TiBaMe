package xxxx;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Homework4_5 {

	public Homework4_5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		
//		西元年份除以4不可整除，為平年。
//		西元年份除以4可整除，且除以100不可整除，為閏年。
//		西元年份除以100可整除，且除以400不可整除，為平年
//		西元年份除以400可整除，為閏年。
		
		//Calendar cal = new GregorianCalendar(2023, (8 - 1), 1);
		//System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
		
		System.out.print("請輸入三個整數:西元年、月、日");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		System.out.printf("輸入的日期為該年第");	
		if(month == 2 && day >= 29) {
			System.out.print("2月只有28天喔!");
		}else {
			int count = 0;
			for(int i = 0; i <= (month - 1); i++) {
				count += days[i];
				} if(year % 4 ==0 || (year % 4 == 0 && year % 100 != 0)|| (year % 100 == 0 && year % 400 ==0)||year % 400 == 0) {
					count++;	
			}System.out.print(count + "天");	
		}

	}

}
