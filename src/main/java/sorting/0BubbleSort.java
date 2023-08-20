package sorting;

//In Bubble sort, we get the biggest element till the end.
// We do this for n times or until there were no swaps in the previous loop
// 8, 9, 7, 2, 10, 12 -> compare 0 and 1 index. if 0 is > 1, swap
// 8, 9, 7, 2, 10, 12 -> compare 1 and 2 index. if 1 is > 2, swap 
// 8, 7, 9, 2, 10, 12 -> compare 2 and 3 index. if 2 is > 3, swap
//.... do this until in the last loop there were no swaps.

//BubbleSort is stable as values with same value stay in the same order.
class BubbleSort {

	public static void main(String[] args) {
		int[] inputArray = { 8, 9, 7, 2, 10, 12 };
		int[] sortedArray = bubbleSort(inputArray);
		for(int i :sortedArray) {
			System.out.print(i);
		}

	}

	private static int[] bubbleSort(int[] inputArray) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < inputArray.length - 2; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					swap(inputArray, j);
					swapped = true;
				}
			}
			if(!swapped) {
				return inputArray;
			}
		}
		return inputArray;

	}

	private static void swap(int[] inputArray, int j) {
		int temp = inputArray[j];
		inputArray[j] = inputArray[j+1];
		inputArray[j+1] = temp;
		
	}
}
