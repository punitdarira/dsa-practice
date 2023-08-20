package neetcode.ArraysHashing;

import java.util.HashMap;

public class TopKFrequentElements {

	public static void main(String[] args) {
		int[] inputArray = {1, 1, 1, 2, 2, 4};
		System.out.println(getKFrequentElements(inputArray, inputArray.length));

	}

	private static char[] getKFrequentElements(int[] inputArray, int length) {
		HashMap<Integer, Integer> intCount = new HashMap<>();
	}

}
