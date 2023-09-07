package xxxx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homework7_3 {

	public Homework7_3() {
//		請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//		代表的檔案會複製到第二個參數代表的檔案
	}
	

	
	public static void copyFile(File file1, File file2) {

		try {
			FileInputStream fis = new FileInputStream(file1);
			BufferedInputStream bis = new BufferedInputStream(fis);

			FileOutputStream fos = new FileOutputStream(file2);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);

			}
			bos.close();
			fos.close();
			bis.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();

		}
		
	}
		public static void main(String[] args) {
			File origin = new File("C:\\THA103_Workspace\\Sample1.txt");
			File copy = new File("C:\\THA103_Workspace\\Sample2.txt");
			copyFile(origin, copy);
		}	
		
	}


