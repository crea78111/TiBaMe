package xxxx;

public class test123 {

	public test123() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	}
		
		public int[][] getRandomArray() {
			int[][] data = new int[3][3];
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[i].length; j++) {
					data[i][j] = (int)(Math.random() * 31);
				}
			}
			return data;
		}
		
		public void printArray(int[][] data) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[i].length; j++) {
					System.out.print(data[i][j] + "\t");
				}
				System.out.println();
			}
			
			System.out.println("=======================");
		}
}
