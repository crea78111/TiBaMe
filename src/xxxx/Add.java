package xxxx;

import java.util.Scanner;

public class Add {

	public Add() {
		// TODO Auto-generated constructor stub
	}

//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//        int i, j;
//        i = sc.nextInt();
//        j = sc.nextInt();
//        
//        System.out.println(i + " + " + j + " = " + (i+j));
//	}
	
//	M=月
//	D=日
//	S=(M*2+D)%3
//	得到 S 的值，再依照 S 的值從 0 到 2 分別給與 普通、吉、大吉 等三種不同的運勢
//	
//	int month = 0;
//	int day = 0;
//	int sum = 
	
	
//			public class MyClass {
//
//	    public static void main(String[] args) {
//
//	        System.out.println("大家好");
//
//	        amethod();
//
//	    }
//
//	    public void amethod() {
//
//	        System.out.println("Hello, World");

//	    }
//		public static void main(String[] args) {
//			System.out.println("本次亂數結果:");
//			rangAvg();
//		}
//		
//		public static void rangAvg() {
//			double sum = 0;
//			for(int i = 1; i<=10; i++) {
//				int ran = (int)(Math.random()*100);
//				System.out.print(ran+" ");
//				sum +=ran;
//			}
//			System.out.println();
//			System.out.println(sum/10);
//		}
		
		
		public static void main(String[] args) {
			genAuthCode();
		}

		public static void genAuthCode() {
			char[] a = new char[8];

			for (int i = 0; i < a.length; i++) {
				int tep = (int) (Math.random() * 122) + 1;
//				48-57、 65-90、97-122
				if (tep >= 48 && 57 >= tep || tep >= 65 && 90 >= tep || tep >= 97 && 122 >= tep) {
					a[i] = (char) tep;
					System.out.print(a[i]);
				} else {
					i--;
				}

			}
		}
		public class AuthCodeGenerator {

		    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		    private static final int CODE_LENGTH = 8;

		    public static void main(String[] args) {
		        String authCode = genAuthCode();
		        System.out.println("驗證碼: " + authCode);
		    }

		    public static String genAuthCode() {
		        SecureRandom random = new SecureRandom();
		        StringBuilder sb = new StringBuilder(CODE_LENGTH);

		        for (int i = 0; i < CODE_LENGTH; i++) {
		            int randomIndex = random.nextInt(CHARACTERS.length());
		            char randomChar = CHARACTERS.charAt(randomIndex);
		            sb.append(randomChar);
		        }

		        return sb.toString();
		    }
		}
		public static void main(String[] args) {
			
			genAuthCode();
		}

		public static void genAuthCode() {

			for (int i = 0; i < 8; i++) {
				switch ((int) (Math.random() * 3)) {
					case 0: 
						System.out.print((char)(int) (Math.random() * 26+97));
					break;
					case 1: 
						System.out.print((char)(int) (Math.random() * 26+65));
					break;
					case 2: 
					System.out.print((char)(int) (Math.random() * 10+48));
					break;
				}
			}
		}
		

		public static void genAuthCode(String str) {

			for (int i = 1; i <= 8; i++) {
				int b = (int) (Math.random() * str.length());
				char x = str.charAt(b);
				System.out.print(x);
			}
		}

//		public static void main(String[] args) {

			String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
			genAuthCode(str);
		
	}
}