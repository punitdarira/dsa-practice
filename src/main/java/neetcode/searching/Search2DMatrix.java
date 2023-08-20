package neetcode.searching;

public class Search2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		System.out.println(matrix.length);
		binarySearch2D(matrix);
	}

	private static void binarySearch2D(int[][] matrix) {

	}

	private static int getFirstIndex(int[][] inputArray, int leftIndex, int rightIndex, int numberToFind) {
		int mid = (int) Math.floor((leftIndex + rightIndex) / 2);
		if (inputArray[mid][0] > numberToFind) {
			return getFirstIndex(inputArray, leftIndex, mid - 1, numberToFind);
		}
		else if (inputArray[mid][0] < numberToFind && inputArray[mid][inputArray[mid].length] < numberToFind) {
			return getFirstIndex(inputArray, mid + 1, rightIndex, numberToFind);
		}
		return 1;
	}

}
