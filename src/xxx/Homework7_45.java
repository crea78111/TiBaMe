package xxx;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Homework7_45 {

	public Homework7_45() {
		// TODO Auto-generated constructor stub
	}
//	• 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	
//	• 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
//	型簡化本題的程式設計)

	public static void main(String[] args) {

		try {
			File directory = new File("C:\\data");
			if (!directory.exists()) {
				directory.mkdir();
			}
			File myFile = new File("C:\\data\\Object.ser");

			Cat cat1 = new Cat("Meow");
			Cat cat2 = new Cat("Meow Meow");
			Dog dog1 = new Dog("Bark");
			Dog dog2 = new Dog("Bark Bark");
			Object[] pet = { cat1, cat2, dog1, dog2 };
			// 輸出
			FileOutputStream fos = new FileOutputStream(myFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			int i;
			for (i = 0; i < pet.length; i++) {
				oos.writeObject(pet[i]);
				oos.flush();
			}
			oos.close();
			fos.close();

			// 輸入

			FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {

				while (true) {
					Pet pet1 = (Pet) ois.readObject();
					pet1.speak();
				}
			} catch (ClassNotFoundException ce) {
				ce.printStackTrace();
			} catch (EOFException eo) {
				System.out.println("資料讀取完成!");
			}

			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}