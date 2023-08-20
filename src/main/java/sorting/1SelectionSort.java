package sorting;

//In selection sort, we get the smallest element and place it in the front.
// In this way, we have 2 parts, 1 sorted part, and other unsorted
class SelectionSort {

	public static void main(String[] args) {
		int[] inputArray = { 8, 9, 7, 2, 10, 12 };
		int[] sortedArray = selectionSort(inputArray);
		for (int i : sortedArray) {
			System.out.println(i);
		}

	}

	private static int[] selectionSort(int[] inputArray) {
		for (int i = 0; i < inputArray.length - 2; i++) {
			int lowestNumberIndex = i;
			for(int j = i; j<inputArray.length -2 ; j++) {
				if(inputArray[j+1] < inputArray[lowestNumberIndex]) {
					lowestNumberIndex = j+1;
				}
			}
			swap(inputArray, i, lowestNumberIndex);
		}
		return inputArray;
	}

	private static void swap(int[] inputArray, int leftIndex, int lowestNumberIndex) {
		int temp = inputArray[leftIndex];
		inputArray[leftIndex] = inputArray[lowestNumberIndex];
		inputArray[lowestNumberIndex] = temp;

	}

}
