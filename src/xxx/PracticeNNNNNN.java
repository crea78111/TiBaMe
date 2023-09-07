package xxx;

public class PracticeNNNNNN {
	
	public PracticeNNNNNN() {
		
	}

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
