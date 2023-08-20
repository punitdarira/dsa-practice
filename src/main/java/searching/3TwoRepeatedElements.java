package searching;

class TwoRepeatedElements {
	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 1, 3, 4, 4 };
		twoRepeatedELements(inputArray);
	}

	private static void twoRepeatedELements(int[] inputArray) {
		for (int i : inputArray) {
			int element = Math.abs(i);
			if(inputArray[element] < 0) {
				System.out.println(element);
			}
			else {
				inputArray[element] = - inputArray[element];
			}
		}
	}
}
