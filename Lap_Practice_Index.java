package AAS_One;

public class Lap_Practice_Index {

	public static void main(String[] args) {

		
		String W = "I have two bunnies with long ears";
		int count = 0;
		char ct = 'e';
		
		for ( int i = 0; i < W.length(); i++) {
			
			if (W.charAt(i) == ct) {
				count++;
			}
		}
		System.out.print(count);
			
		
		
		
	}

}
