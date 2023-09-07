package practice;

public class CubeTest{

	public CubeTest() {

	}

	public static void main(String[] args){
	
		try {
			Cube cb = new Cube(2);
			System.out.print("正立方體的面積為" + cb.volume());
		} catch (CubeException e) {
			e.printStackTrace();
		}
		
	}
}
