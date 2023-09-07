package xxxx;

public class Homework5_3 {

	public Homework5_3() {
		// TODO Auto-generated constructor stub
	}
//	利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳，如圖：
	
		public static void main(String[] args) {
			int[][] x= {{1, 6, 3},
					   {9, 5, 2}
					   };

			double[][] y= {{1.2, 3.5, 2.2},
						   {7.4, 2.1, 8.2}
						   };
			
			int intx = maxElement(x);
			double doubley = maxElement(y);
			System.out.print("二維陣列的最大值為" + intx);
			System.out.print("\n二維陣列的最大值為" + doubley);
		}
		
	public static int maxElement(int x[][]){
		
		int maxvalue = x[0][0];
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if( x[i][j] > maxvalue) {
					maxvalue = x[i][j];
				}
			}
			
		}
		return maxvalue;
		
	}
	
	public static double maxElement(double x[][]) {
		double maxvalue = x[0][0];
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if( x[i][j] > maxvalue) {
					maxvalue = x[i][j];
				}
			}
			
		}
		return maxvalue;
		
	}
}
