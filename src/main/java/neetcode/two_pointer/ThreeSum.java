package neetcode.two_pointer;

import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		// find triplets who's sum is 0
		int[] inputArray = { -1, 0, 1, 2, -1, -4 }; // -4 -1 -1 0 1 2
		findTriplets(inputArray);
	}

	private static void findTriplets(int[] inputArray) {
		Arrays.sort(inputArray);
		for (int i = 0; i < inputArray.length -3 ; i++) {
			if(i != 0 && inputArray[i] == inputArray[i-1]) {
				continue;
			}
			findPairsTotaingNumber(-inputArray[i], inputArray, i + 1);
		}
	}
	

	private static boolean findPairsTotaingNumber(int totalingNumber, int[] subArray, int startingIndex) {
		int leftIndex = startingIndex;
		int rightIndex = subArray.length - 1;
		while(leftIndex < rightIndex) {
			if(subArray[leftIndex] + subArray[rightIndex] == totalingNumber) {
				System.out.println(-totalingNumber);
				System.out.println(subArray[leftIndex] +" " + subArray[rightIndex]);
				return true;
			}
			else if(subArray[leftIndex] + subArray[rightIndex] < totalingNumber) {
				leftIndex ++;
			}
			else {
				rightIndex++;
			}
		}
		return false;
	}

}
