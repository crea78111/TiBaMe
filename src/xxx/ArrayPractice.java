package xxx;

public class ArrayPractice {

	public ArrayPractice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		// step 1: 建立三個 3x3 的二維陣列
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		
		// step 2: 將亂數資料填入到x陣列
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int)(Math.random() * 31);
			}
		}
		
		// step 3: 將亂數資料填入到y陣列
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[i][j] = (int)(Math.random() * 31);
			}
		}
		
		// step 4: 把x & y 對應位置的元素相加放進z陣列
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		// step 5: 將三個陣列的元素列印出來
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				System.out.print(y[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		
	}

}
