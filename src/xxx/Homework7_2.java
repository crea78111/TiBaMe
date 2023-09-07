package xxx;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Homework7_2 {

	public static void main(String[] args) throws IOException {
//		請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
//		append功能讓每次執行結果都能被保存起來)

		FileOutputStream fos = new FileOutputStream("c:\\THA103_Workspace\\Data.txt",false);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		
		int num = 0;
		for (int i = 0; i < 10; i++) {
			num = (int) (Math.random() * 1001);
			ps.println(num);
			ps.flush();
		}
		
		ps.close();
		bos.close();
		fos.close();

	}

}
