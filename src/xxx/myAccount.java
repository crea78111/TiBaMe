package xxx;

public class myAccount {
	
	public static void main(String[] args) {

		Account account = new Account();
		Mom mom = new Mom(account);
		Son son = new Son(account);

		mom.start();
		son.start();
	}

}

class Account {

	private int balance = 0; // 存款

	synchronized public void deposit(int amount) {
		while (balance >= 3000) {
			System.out.println("存款超過3000，不用匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += amount;
		System.out.println("媽媽存了" + amount + ",戶頭餘額為" + balance);
		notify();
	}

	synchronized public void withdraw(int amount) {
		while (balance < amount) {
			try {
				System.out.println("熊大沒錢可領");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("熊大領了1000元" + ",帳戶餘額" + balance);
		if (balance <= 2000) {
			System.out.println("戶頭低於2000,熊大要求匯款");
		}
		notify();
	}
}

class Mom extends Thread {
	private Account account;

	public Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.deposit(2000);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Son extends Thread {
	private Account account;

	public Son(Account account) {
		this.account = account;

	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.withdraw(1000);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
