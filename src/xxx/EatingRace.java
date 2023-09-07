package xxx;

public class EatingRace implements Runnable{
	String name;
	int count = 1;
	
	public EatingRace() {
		// TODO Auto-generated constructor stub
	}
//	• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	競賽過程。
//	• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//	Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//	• 參考範例：CounterRunnable.java
//	• 需留意主執行緒執行順序
	
	EatingRace(String name){
		this.name = name;
	
	}
	
	@Override
	public void run() {
		while (count <= 10) {
			System.out.println(name + "吃第" + count + "碗了!");
			count++;

			if (count > 10) {
				System.out.println(name + "吃完了!!!");
			}
			
			
			int second = ((int) (Math.random() * 2501)) + 500;
			try {
				Thread.sleep(second);
			} catch (Exception e) {

			}
		}
	}

	public static void main(String[] args) {
		EatingRace e1 = new EatingRace("饅頭人");
		Thread t1 = new Thread(e1);
		EatingRace e2 = new EatingRace("詹姆士");
		Thread t2 = new Thread(e2);
		System.out.println("=========大胃王比賽開始!=========");
		t1.start();
		t2.start();
		 
		try {
			t1.join();
			t2.join();
		System.out.println("=========大胃王比賽結束!=========");
		} catch (InterruptedException ee) {
			ee.printStackTrace();
		}
	}
	
	
}
