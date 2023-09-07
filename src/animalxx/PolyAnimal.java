package animalxx;

public class PolyAnimal {

	public PolyAnimal() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Animal2[] e = new Animal2[3];
		
		e[0] = new Animal2(3, 5.0);
		e[1] = new Elephant2(8, 1200.0, 67);
		e[2] = new Lion2(8, 1200.0, 100, "red");
		
		int i;
		for(i = 0; i < e.length ; i++)
			System.out.println(e[i].getHeight());
	}
}
