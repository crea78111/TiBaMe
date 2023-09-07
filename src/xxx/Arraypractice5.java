package xxx;

public class Arraypractice5 {

	public Arraypractice5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int [][] x = new int[4][8];
	
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j <x[i].length; j++) {
				System.out.println(x[i][j]);
				x[i][j]= (int)(Math.random() * 31);
				
			}
		}
	}
}
