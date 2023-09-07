package xxxx;

public class Homework1 {

	public Homework1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        //• 請設計一隻Java程式,計算12,6這兩個數值的和與積

		int a = 12, b = 6;
		int c = a + b;
		int d = a * b;

		System.out.println("12 + 6為: "+ c);
		System.out.println("12 x 6為: "+ d);	
		System.out.println("-------------------------");	

		//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

		double egg = 200;
		int egg1 = 200/12;
		double egg2 = egg%12;

		System.out.printf("200顆雞蛋等於 %d 箱" + "%.0f 顆%n", egg1, egg2);	
		System.out.println("-------------------------");	

		//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒

		double seconds = 256559;
		double secminhr = 60 * 60 *24;
		double secmin = 60 * 60;

		int days = (int) seconds / (int) secminhr;
		double hrs = (seconds % secminhr) / secmin;	
		double mins = ((seconds % secminhr) % secmin)/60;
		double secs = ((seconds % secminhr) % secmin)/60/60;

		System.out.printf("256559秒等於%d天%.0f小時%.0f分%.0f秒%n", days, hrs, mins, secs);
		System.out.println("-------------------------");


		//• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

		final double PI = 3.1415;
		double area = 5 * 5 * PI;
		double circle = 5 * 2 * PI;

		System.out.printf("半徑為5的圓面積= %.2f%n",area);
		System.out.printf("半徑為5的圓面積= %.2f%n",circle);
		System.out.println("-------------------------");

		//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
		//金加利息共有多少錢 (用複利計算,公式請自行google)

		int money = 1500000;
		double rate = 1.02;
			
		System.out.printf("10年後本金和利息共為 %f%n", money*Math.pow(rate, 10));
		System.out.println("-------------------------");


		//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//			5 + 5
//			5 + ‘5’
//			5 + “5"
		System.out.println("5 + 5 = " + (5 + 5));//整數的相加
		System.out.println("5 + ‘5’=" + (5 + '5'));//整數與字元UNICODE結合
		System.out.println("5 + “5” =" + (5 + "5"));//整數與字串的相加

		//並請用註l解各別說明答案的產生原因

		}
}

