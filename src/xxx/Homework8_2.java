package xxx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Homework8_2 {

	public Homework8_2() {
		// TODO Auto-generated constructor stub
	}
//	• 請設計一個Train類別，並包含以下屬性：
//	- 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
//	- 目的地 dest，型別為String - 票價 price，型別為double
//	• 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
//	需使用的集合裡
//	- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//	- (1254, “區間”, “屏東”, “基隆”, 700)
//	- (118, “自強”, “高雄”, “台北”, 500)
//	- (1288, “區間”, “新竹”, “基隆”, 400)
//	- (122, “自強”, “台中”, “花蓮”, 600)
//	- (1222, “區間”, “樹林”, 七堵, 300)
//	- (1254, “區間”, “屏東”, “基隆”, 700)
//
//	• 請寫一隻程式，能印出不重複的Train物件
//	• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
//	• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
//	• (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
	
	public static void main(String[] args) {
//		• 請寫一隻程式，能印出不重複的Train物件
		Set<Train> trainSet = new HashSet<Train>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		trainSet.add(t1);
		trainSet.add(t2);
		trainSet.add(t3);
		trainSet.add(t4);
		trainSet.add(t5);
		trainSet.add(t6);
		trainSet.add(t7);

		// 請寫一隻程式，能印出不重複的Train物件
		//用Iterator取出元素
		System.out.println(" ");
		System.out.println("用Iterator取出元素:");
		Iterator<Train> it = trainSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(" ");
		System.out.println("用foreach取出元素:");
		//用Set家族無法使用for迴圈取出元素
		//用for-each取出元素
		for (Train xx : trainSet)
			System.out.println(xx);
		
//		• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		List<Train> trainList = new ArrayList<>();	
		
		trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainList.add(new Train(118, "自強", "高雄", "台北", 500));
		trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		Collections.sort(trainList);
		
		System.out.println(" ");
		System.out.println("用Iterator取出元素:");
		Iterator<Train> it2 = trainList.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println(" ");
		System.out.println("用for迴圈取出元素:");
		for (int i = 0; i < trainList.size() ; i++) {
			Train train = trainList.get(i);
			System.out.println(train);
		}
		
		System.out.println("");
		System.out.println("用foreach取出元素:");
		for (Train yy : trainList)
			System.out.println(yy);
		
//		• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件	
		Set<Train> TrainTreeSet = new TreeSet<>();
		TrainTreeSet.add(t1);
		TrainTreeSet.add(t2);
		TrainTreeSet.add(t3);
		TrainTreeSet.add(t4);
		TrainTreeSet.add(t5);
		TrainTreeSet.add(t6);
		TrainTreeSet.add(t7);

		System.out.println(" ");
		System.out.println("用Iterator取出元素:");
		Iterator<Train> it3 = TrainTreeSet.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}	
		
		System.out.println("");
		System.out.println("用foreach取出元素:");
		for (Train zz : TrainTreeSet)
			System.out.println(zz);
	}

}

