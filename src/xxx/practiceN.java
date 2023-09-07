package xxx;

public class practiceN {

	public practiceN() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		
		for(int i = 0; i < a.length ; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] =  (int)(Math.random()* 31);
				System.out.print(a[i][j] + "\t");
				
			}System.out.println();
		}
		
		System.out.println("--------------------------");
		
		for(int i = 0; i < b.length ; i++) {
			for(int j = 0; j < b[i].length; j++) {
				b[i][j] =  (int)(Math.random()* 31);
				System.out.print(b[i][j] + "\t");
				
			}System.out.println();
		}
		System.out.println("--------------------------");
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\t");
				
			}System.out.println();

		}System.out.println("--------------------------");
	}
}
