package xxxx;

public class Tibame {
	
	public static void main(String[] args) {
		System.out.println("Tibame開門了");
		Classroom c1 = new Classroom(401, "小吳");
		Classroom c2 = new Classroom(402, "郭老");
		Classroom c3 = new Classroom(403, "怡榕");
		
		c1.start();
		c2.start();
		c3.start();
		
		try {
			c1.join();
			c2.join();
			c3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Tibame關門...");
	
	
//		public void copyFile(File origin, File copy) {
//			/**
//			 * Copies a specified file to another file.
//			 * @param origin the source file.
//			 * @param copy the destination file. 
//			 */
//			try {
//				FileInputStream fis = new FileInputStream(origin);
//				BufferedInputStream bis = new BufferedInputStream(fis);
//				FileOutputStream fos  = new FileOutputStream(copy);
//				BufferedOutputStream bos = new BufferedOutputStream(fos);
//				int c;
//				
//				while ((c = fis.read()) != -1) {  // Use c to store the next byte of data when invoking fis.read(),
//					fos.write(c);                 // because each time fis.read() is invoked, the pointer will move to the next byte.
//				}
//				bis.close();
//				fis.close();
//				bos.close();
//				fos.close();
//			} catch (IOException e) {
//				System.err.println(e);
//			}
//		}
//		
	
	}
}
