package xxxx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public CalTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws CalException{
		
		while(true)
		try {
			Scanner sc = new Scanner(System.in);
			Calculator ca = new Calculator();
			int x = 0; int y = 0;
			System.out.println("請輸入x的值");
			x = sc.nextInt();
			System.out.println("請輸入y的值");
			y = sc.nextInt();
			ca.powerXY(x, y);
			break;
		} catch (InputMismatchException se) {
			System.out.println("格式不正確喔~");
		} catch (CalException e) {
			System.out.println(e.getMessage());
		}
	}
}