package xxxx;

import java.util.Scanner;

public class RegexText {

	public RegexText() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tel = sc.next();
		
		String regex = "^[A-Za-z][12][0-9]{8}$";
		
		if(tel.matches(regex)) {
			System.out.println("OK");
		}else {
			System.out.println("No good...");
		}
		
	}

}
