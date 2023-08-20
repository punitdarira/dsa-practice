package searching;

class BinarySearch {
	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7,  9, 10 };
		System.out.println(doBinarySearch(inputArray, 0, inputArray.length, 8));
	}

	private static boolean doBinarySearch(int[] inputArray, int startIndex, int endIndex, int targetInt) {
		if (startIndex == endIndex) {
			return false;
		}
		int midIndex = (int) Math.floor((startIndex + endIndex) / 2);
		if (targetInt == inputArray[midIndex]) {
			return true;
		} else if (targetInt > inputArray[midIndex]) {
			return doBinarySearch(inputArray, midIndex + 1, endIndex, targetInt);
		} else {
			return doBinarySearch(inputArray, startIndex, midIndex - 1, targetInt);
		}

	}
}
