package xxxx;

public class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}
	
class Account{

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
			System.out.println("媽媽說戶頭有" + balance);
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
}
