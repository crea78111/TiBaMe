package xxx;

public class TestNineNine {

	public TestNineNine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		//for + while
		int i;	
		for (i = 1; i <= 9; i++) {
			int j = 0;
			while (j <= 9) {
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();		
		}
		System.out.println("-----------------------------------------");

//		for + do while
		int k = 1;
		for (k = 1; k <= 9; k++) {
			int j = 0;
			do {
				j++;
				System.out.print(k + "*" + j + "=" + k * j + "\t");

			} while (j <= 9);
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		

		//while + do while
		
		int P = 0; 
		while (P <= 8) {
			P++;
			int Q = 0;
			do {
				Q++;
				System.out.print(P + "*" + Q + "=" + P * Q + "\t");
			} while (Q <= 9);
			System.out.println();
		}
		

	}

}
