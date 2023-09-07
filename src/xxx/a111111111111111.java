package xxx;

import module12_15.AddInt;

public class a111111111111111 {

	public a111111111111111() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		AddInt add = new AddInt();
		int sum1 = add.varArgTest(1, 2);
		int sum2 = add.varArgTest(1, 2, 3, 4);

		System.out.println("sum1=" + sum1); // 3
		System.out.println("sum2=" + sum2); // 10
//	public static void main(String[] args) {
//	
//		for (char x = 'A'; x <= 'F'; x++) {
//			for (char y = 'A'; y <= x; y++) {
//				System.out.print(x);
//	}System.out.println();
//}
		public int varArgTest(int... c) {
			int sum = 0;

			for (int i = 0; i < c.length; i++) {
				sum += c[i];
			}

			return sum;
		}
}
}
