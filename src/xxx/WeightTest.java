package xxx;

public class WeightTest {
	
	public static void main(String[] args) {
		Weightable[] objs = new Weightable[3];//用介面當作類別建立新的陣列物件
		
		objs[0] = new Dog();
		objs[1] = new Plane();
		objs[2] = new Powder();
		
		for (int i = 0; i < objs.length; i++) {
			objs[i].getWeightTool();
		}
	}
}
