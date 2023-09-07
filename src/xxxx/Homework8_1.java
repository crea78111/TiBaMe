package xxxx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Homework8_1 {

	public Homework8_1() {
		// TODO Auto-generated constructor stub
	}
//	• 請建立一個Collection物件並將以下資料加入：
//	Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//	Object物件、“Snoopy”、BigInteger(“1000”)
//	• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//	• 移除不是java.lang.Number相關的物件
//	• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
	public static void main(String[] args) {
	
	//建立一個Collection物件並加入以下資料	
	List list = new ArrayList();
	list.add(new Integer(100));
	list.add(new Double(3.14));
	list.add(new Long(21L));
	list.add(new Short("100"));
	list.add(new Double(5.1));
	list.add("Kitty");
	list.add(new Integer(100));
	list.add(new Object());
	list.add("Snoopy");
	list.add(new BigInteger("1000"));
	
	//用Iterator印出所有元素
	Iterator objs = list.iterator();
	while(objs.hasNext())
	System.out.println(objs.next());
	
	System.out.println("--------------------------------");
	
	//用傳統for印出所有元素
	for(int i = 0; i < list.size(); i++) {
		Object obj = list.get(i);
		System.out.println(obj);
	}
	
	System.out.println("--------------------------------");
	
	//用foreach印出所有元素
	for(Object i : list) {
		System.out.println(i);
	}
		
	System.out.println("--------------------------------");
	
	//移除不是java.lang.Number相關的物件，並且再次印出此集合物件的元素
	for(int i = 0; i < list.size(); i++) {
		Object obj = list.get(i);
		if(obj instanceof Number) {
			System.out.println(obj);
		}
	}
	
	}

}
