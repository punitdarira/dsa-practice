package array;

class SmallestPositiveNumber {

	public static void main(String[] args) {
		int[] inputArray = {0,-10,1,3,-20};
		System.out.println(smallestPositiveNo(inputArray, inputArray.length));
	}
	private static int smallestPositiveNo(int[] arr, int n) {
		// Your code here
		// create a new array of boolean
		// Use the value of original array as an index in this newly boolean array
		// If element exists, update the value of that index as 1 otherwise 0
		// this is not complete solution but the answer to this question is creating a new bool array
		boolean[] boolArray = new boolean[arr.length];
		for(int intVal : arr) {
			if(!(intVal <= 0 || intVal > arr.length )) {
				boolArray[intVal] = true;
			}
		}
		System.out.println(boolArray);
		
		return 1;
    
	}

}
