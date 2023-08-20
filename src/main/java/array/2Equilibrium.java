package array;

import java.util.Arrays;

// check whether an index exists in the array where the sum of elements to its left is = to the sum of elements
//to its right.
class Equilibrium {
	public static void main(String[] args) {
		int arr[] = {3, 4, 8, -9, 20, 6};
		//int arr[] = {4, 2, 2};
		int rightSum = Arrays.stream(arr).sum();
		int leftSum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			rightSum -= arr[i];
			if(leftSum == rightSum) {
				System.out.println("Array is equilibrium with index " + i);
				break;
			}
			leftSum += arr[i];
		}
		//System.out.println("Not equilibrium");
	}
}
