package xxx;

import java.util.Scanner;

import animalxx.Animal2;
import animalxx.Elephant2;

public class a123456 {

	public a123456() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		
//		Animal2 rabbit = new Animal2(3, 8.0);
//		Elephant2 elephant = new Elephant2(8, 1200.0, "David");
//		
//		rabbit.speak();
//		elephant.speak();
		
//		System.out.println("有個字串陣列(八大行星)，請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)");
//	    
//		String[] s8={"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"} ;
//		int aeiou=0;
//		for(int i=0; i<s8.length;i++) {
//			for(int j=0; j<s8[i].length();j++) {
//				switch(s8[i].charAt(j)){
//				case 'a':
//					aeiou=aeiou+1;
//					break;
//				case 'e':
//					aeiou=aeiou+1;
//					break;
//				case 'i':
//					aeiou=aeiou+1;
//					break;
//				case 'o':
//					aeiou=aeiou+1;
//					break;
//				case 'u':
//					aeiou=aeiou+1;
//					break;
//				}
//			}
//		}
//  
//		System.out.println("八大行星字串陣列共有"+aeiou+"個母音(a,e,i,o,u)");				
//		System.out.println("===============================");
		
		int[][] c1 = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入小文欲借的金額=");
		int m1 = sc.nextInt();
		System.out.println("有錢可借的員工編號:");
		for (int i = 0; i < c1[1].length; i++) {
			if (m1 <= c1[1][i]) {
				count += 1;
				System.out.print(c1[0][i] + "  ");
			}
		}
		System.out.print("共" + count + "人！");
		System.out.println();
		System.out.println("===============================");

		
		
	}

}
