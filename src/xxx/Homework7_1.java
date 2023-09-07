package xxx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework7_1 {
	
	public static void main(String[] args) {
		
//		請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//		Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

		try {

			int i;
			String s;
			int count = 0;
			int row = 0;
			File file = new File("c:\\THA103_Workspace\\Sample.txt");

			FileReader fr = new FileReader("c:\\THA103_Workspace\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			FileReader fr1 = new FileReader("c:\\THA103_Workspace\\Sample.txt");
			BufferedReader br1 = new BufferedReader(fr1);

			System.out.println("Sample.txt檔案共有" + file.length() + "位元組");

			while ((i = br.read()) != -1)
			count++;

			System.out.println("Sample.txt檔案共有" + count + "個字元");
			

			while ((s = br1.readLine()) != null)
				row++;
			
			System.out.println("Sample.txt檔案共有" + row + "列資料");

			br1.close();
			fr1.close();
			br.close();
			fr.close();
		
			
		} catch (IOException e) {
		 e.printStackTrace();
	}
 }
}
