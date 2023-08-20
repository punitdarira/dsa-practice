package sorting;


//In merge sort, combining 2 already sorted arrays

//This is working but little bug with the end loop of the program on line 24
class MergeSort {

	public static void main(String[] args) {
		int[] inputArray2 = { 1, 6, 8, 10, 12 };
		int[] inputArray1 = { 2, 3, 4, 5, 6, 7, 8 };
		int[] sortedArray = mergeSort(inputArray1, inputArray2);
		for (int i : sortedArray) {
			System.out.println(i);
		}

	}

	private static int[] mergeSort(int[] inputArray1, int[] inputArray2) {
		int[] resultArray = new int[inputArray1.length + inputArray2.length];

		int array1Index = 0, array2Index = 0, resultArrayIndex = 0;

		while (array1Index < inputArray1.length || array2Index < inputArray2.length) {
			if (inputArray1[array1Index] < inputArray2[array2Index]) {
				resultArray[resultArrayIndex] = inputArray1[array1Index];
				array1Index++;
			} else {
				resultArray[resultArrayIndex] = inputArray2[array2Index];
				array2Index++;
			}
			resultArrayIndex++;
		}
		return resultArray;
	}

	private static void swap(int[] inputArray, int leftIndex, int rightIndex) {
		int temp = inputArray[leftIndex];
		inputArray[leftIndex] = inputArray[rightIndex];
		inputArray[rightIndex] = temp;

	}

}
