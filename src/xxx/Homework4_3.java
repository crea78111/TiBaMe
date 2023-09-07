package xxx;

public class Homework4_3 {

	public Homework4_3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("我是第三題");
		String array[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int vowel = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length(); j++) {
				switch (array[i].charAt(j)) {
				case 'a':
					vowel += 1;
					break;
				case 'e':
					vowel += 1;
					break;
				case 'i':
					vowel += 1;
					break;
				case 'o':
					vowel += 1;
					break;
				case 'u':
					vowel += 1;
					break;
				}
			}
		}
		
		System.out.println("在八大行星中，母音共有" + vowel + "個");

	}

}
