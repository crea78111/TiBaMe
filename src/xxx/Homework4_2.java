package xxx;

public class Homework4_2 {

	public Homework4_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
		System.out.println("我是第二題");
		String a = "Hello World";
		for (int j = a.length() - 1; j >= 0; j--) {
			System.out.print(a.charAt(j));
			
		//System.out.println(new StringBuffer("Hello World!").reverse());
		//老師提供的解答!!!
		}

	}

}
