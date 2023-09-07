package xxxx;

public class Homework5_5 {

	public Homework5_5() {
		// TODO Auto-generated constructor stub
	}


//		身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//		genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//		與數字的亂數組合，如圖
		
	public static String genAuthCode() {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String authCode = new String();

		for (int i = 0; i < 8; i++) {
			authCode += s.charAt((int) (Math.random() * s.length()));
		}
		return authCode;
	}
		public static void main(String[] args) {
			
			String auth = genAuthCode();
			System.out.print("驗證碼為" + auth);
		}
	}
