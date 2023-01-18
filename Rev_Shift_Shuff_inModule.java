package Test;

public class Rev_Shift_Shuff_inModule {

	public static void main(String[] args) {
		int[] Array = { 1, 2, 3, 4, 5 };

		Shift(Array);
		Reverse(Array);
		Shuffle(Array);

		}

		public static int[] Shift (int[] Array) {

		int[] NewArray = new int [Array.length];

		for (int i = 1; i < NewArray.length; i++) {

		NewArray[i] = Array[i - 1];

		}
		NewArray[0] = Array[Array.length -1];

		System.out.println("The Shifted Array is: ");
		for (int i = 0; i < NewArray.length; i++) {
		System.out.println(NewArray[i]);

		}
		return NewArray;
		}


		public static int[] Reverse (int[] Array) {



		int[] Rev = new int [Array.length];

		for (int i = 0, j = Rev.length -1; i < Array.length; i++, j--) {

		Rev[j] = Array[i];
		}

		System.out.println("The Reversed Array is: ");
		for (int i = 0; i < Rev.length; i++) {

		System.out.println(Rev[i]);

		}
		return Rev;
		}


		public static int[] Shuffle (int[] Array) {

		int[] Shuff = {1,2,3,4,5};

		for (int i = 0; i < Shuff.length; i++) {

		int index = (int) (Math.random() * Shuff.length);

		int temp = Shuff[i];
		Shuff[i] = Shuff[index];
		Shuff[index] = temp;

		}
		System.out.println("The Suffled Array is: ");

		for (int i = 0; i < Shuff.length; i++) {
		System.out.println(Shuff[i]);

		}
		return Shuff;
		}
	}


