package xxx;

public class Homework4_6 {

	public Homework4_6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		 班上有8位同學，他們進行了6次考試結果如下：
//		 請算出每位同學考最高分的次數
		
		int[][] score = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90 },
				{90, 80, 100, 75, 50, 20, 99, 75}};
		
		int[] array = new int[8];
		int highscore, newhighscore;
		for (int i = 0; i < score.length; i++) {
			highscore = score[i][0];
			newhighscore = 0;
			for (int j = 1; j < score[i].length; j++) {
				if (highscore < score[i][j]) {
					highscore = score[i][j];
					newhighscore = j;
				}
			}
			array[newhighscore]++;
		}
			for (int i = 0; i < array.length; i++) {
				System.out.println("第" + (i + 1) + "位同學考最高的分數次數為:" + array[i]);
			}
		

	}

}
