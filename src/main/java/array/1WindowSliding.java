package array;


// Find whether a subarray exists with a particular sum.
//for ex, arr=[1, 4, 20, 3, 10, 5] sum = 33. Return yes because 20, 3, 10 is 33
//Here we are using sliding window with dynamic start and end index for the window.
class WindowSliding {
	public static void main(String[] args) {
		int[] arr = {1, 4, 20, 3, 10, 5};
		int requiredSum = 33;
		int s=0, e=0, sum=0;
		while(s < arr.length-1) {
			for(int i = s; i <= e; i++) {
				sum += arr[i];
			}
			if(sum < requiredSum) {
				e++;
			}else if(sum > requiredSum) {
				s++;
			}
			else {
				
			}
		}
	}
}


//Didn't try running the problem but you get the idea