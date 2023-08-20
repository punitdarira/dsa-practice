package neetcode.two_pointer;

public class TwoSum {

	public static void main(String[] args) {
		int[] inputArray = { 2, 7, 11, 15 };
		twoSum(inputArray, 18);

	}

	private static void twoSum(int[] inputArray, int desiredInt) {
		// TODO Auto-generated method stub
		int leftIndex = 0;
		int rightIndex = inputArray.length - 1;
		while(leftIndex < rightIndex) {
			if((inputArray[leftIndex] + inputArray[rightIndex]) == desiredInt) {
				System.out.println("Output is " + inputArray[leftIndex] + ", " + inputArray[rightIndex]);
				break;
			}
			else if((inputArray[leftIndex] + inputArray[rightIndex]) < desiredInt) {
				leftIndex ++;
			}
			else {
				rightIndex--;
			}
		}
		
	}

}
