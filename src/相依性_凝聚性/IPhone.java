package xxx;

import java.io.IOException;

public class IPhone extends SmartPhone {
	
	public void sendSMS() throws Exception {//NG!!!因為SmartPhone位階比IPhone位階高
		System.out.println("很潮的發送簡訊");
	}

}
