package xxxx;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

//	public static void main(String[] args) {
//		int input, count = 0;
//		int com[] = new int[6];
//		int num[] = new int[49];
//		
//		System.out.println("阿文...請輸入你討厭哪個數字");
//		while (true) {
//			
//		Scanner sc = new Scanner(System.in);
//			
//			if (sc.hasNextInt()) {
//				input = sc.nextInt();
//				if (input > 0 && input < 10) {
//					
//					for (int i = 1; i <= 49; i++)
//						if ((i % 10 != input) && (i / 10 != input))
//							System.out.print((num[count++] = i) + " ");
//					System.out.println("\n總共:" + count + "個數字可選");
//					System.out.println("電腦選號:");
//					for (int i = 0; i < 6; i++) {
//						com[i] = num[(int) (Math.random() * count)];
//						for (int j = 0; j < i; j++)
//							while (com[i] == com[j])
//								com[i] = num[(int) (Math.random() * count)];
//					}
//					for (int i = 0; i < 6; i++)
//						System.out.print(com[i] + " ");
//					break;
//					
//				}
//			}
//			System.out.println("請輸入整數1~9");
//		}

			
			public static void main(String[] args) {
			//List
				
			//1.建立collection物件，將資料加入
			ArrayList <Object>list = new ArrayList <Object>();
			list.add(new Integer(100));
			list.add(new Double(3.14));
			list.add(new Long(21L));
			list.add(new Short("100"));
			list.add(new Double(5.1));
			list.add("Kitty");
			list.add(new Integer(100));
			list.add(new Object());    
			list.add("Snoopy");
			list.add(new BigInteger("1000"));
			
			//2.印出所有物件(Iterator,傳統for和foreach)
			//foreach方法
			for(Object o : list)
				System.out.println(o);
			//for方法
//			for(int a=0 ; a<list.size(); a++)
//				System.out.println(list.get(a));
			System.out.println("-------------------------------------------------");
			
			//3.移除不是java.lang.Number物件
			System.out.println("移除不是java.lang.Number物件 : ");
			for(int b = 0 ; b <list.size(); b++) {
				if(!(list.get(b) instanceof Number)) {
					System.out.println("this size = " + list.size());
					list.remove(list.get(b));
					b--;
				}
			} 
			
			//4.再印出所有元素，觀察number相關物件移除
			for(Object o : list)
				System.out.println(o);
			}
		
	}


