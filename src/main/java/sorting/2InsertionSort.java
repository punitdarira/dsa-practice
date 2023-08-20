package sorting;


//In insertion sort, there are 2 imaginary divided arrays.
// as we loop, we take the element and insert in between (desired place) in the sorted part of the array.
// this way has 2 imaginary arrays like selection sort. But in selection sort, the values get added only at the end
//of the sorted part.
//In this method, the value can be inserted in the middle of the sorted part too.
class InsertionSort {

	public static void main(String[] args) {
		int[] inputArray = { 8, 9, 7, 2, 10, 12 };
		int[] sortedArray = insertionSort(inputArray);
		for (int i : sortedArray) {
			System.out.println(i);
		}

	}

	private static int[] insertionSort(int[] inputArray) {
		for (int i = 0; i < inputArray.length -1 ; i++) {
			int insertElementIndex = i + 1;
			while (insertElementIndex != 0 && (inputArray[insertElementIndex] < inputArray[insertElementIndex - 1]) ) {
				swap(inputArray, insertElementIndex-1, insertElementIndex);
				insertElementIndex --;
			}
		}
		return inputArray;
	}

	private static void swap(int[] inputArray, int leftIndex, int rightIndex) {
		int temp = inputArray[leftIndex];
		inputArray[leftIndex] = inputArray[rightIndex];
		inputArray[rightIndex] = temp;

	}

}
