package array;

class LeaderInArray {
	

	public static void main(String args[]) {
		int arr[]= {7, 10, 4, 3, 6, 5, 2};
		
		int pointer = arr[arr.length-1];
		System.out.println(pointer);
		for(int i = arr.length-1; i>=0;i--) {
			if(arr[i]>pointer) {
				System.out.println(arr[i]);
				pointer = arr[i];
			}
		}
	}
}
