package xxx;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class randomTest {

	public randomTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Set set = new HashSet();
		while(set.size() != 6) {
			int r = (int)(Math.random()* 49 + 1);
			set.add(r);
		}
		
		Iterator it = (Iterator) set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
