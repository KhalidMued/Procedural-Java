package Test;

public class Atrrays_Example {

	public static void main(String[] args) {
		int initialOne = 1;
		int [] one = new int [10];
		
		int initialTwo = 1;
		int [] Two = new int [10];
		
		int [] Total = new int [10];
		
		//First Array
		for ( int i = 0; i<10; i++) {
			//List Element for First Array
			one[i]= initialOne;
			initialOne ++;
			
			//List Element for Second Array
			Two[i]= initialTwo;
			initialTwo ++;
		}
		
		//Total Array
		for (int i = 0; i<10; i++) {
		
		Total[i]= one[i]+Two[i];
	
		System.out.print(Total[i] + "," );
		}
		
	}

}
