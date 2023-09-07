package xxxx;

public class TEST8 {

	public TEST8() {
		
	}

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			
			sum += intArray[i];
		}
			System.out.println("總和為:" + sum);
		
		int[][] intArray2 = {{1, 2, 3, 4, 5},
							{6, 7, 8, 9, 10}};
	
		int sum2 = 0;
		for(int i = 0; i < intArray2.length; i++) { 
			for(int j = 0; j < intArray2[i].length; j++)  
				sum += intArray2[i][j];
		}
			System.out.println(sum);

	}

}
