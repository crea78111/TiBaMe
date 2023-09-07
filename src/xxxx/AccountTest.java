package xxxx;

public class AccountTest {

	public AccountTest() {
		// TODO Auto-generated constructor stub
	}

}
public class Main {

	public static void main(String[] args) {
		
		Account2 account = new Account2();
			Mom mom = new Mom(account);
			Son son = new Son(account);

			mom.start();
			son.start();
		}
	}
