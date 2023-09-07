package xxx;

public class Homework4_1 {

	public Homework4_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		• 有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性
		System.out.println("我是第一題");
		int array[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int i = 0;
		int sum = 0;
		int average = 0;
		for (i = 0; i < array.length; i++) {
			sum += array[i];
			average = sum / array.length;
		}
		System.out.print("平均值為" + average);

		System.out.println("\n大於平均值的元素為");
		for (i = 0; i < array.length; i++) {
			if (array[i] > average) {
				System.out.print(array[i]+ " ");
				
			}
		}
	}
}
	


