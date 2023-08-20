package searching;

class MaximumWater{
	public static void main(String args[]) {
		int[] buildings = new int[] {2, 8, 3, 4, 5, 6};
		System.out.println(maximumArea(buildings));
	}
	private static int maximumArea(int[] buildings) {
		int leftIndex, rightIndex;
		int[] answer = new int[2];
		leftIndex = 0;
		rightIndex = buildings.length - 1;
		int area=0;
		while(leftIndex < rightIndex) {
			int tempArea = Math.min(buildings[leftIndex], buildings[rightIndex]) * (rightIndex - leftIndex - 1);
			if (area < tempArea) {
				area = tempArea;
				answer[0] = buildings[leftIndex];
				answer[1] = buildings[rightIndex];
			}
			if(buildings[leftIndex] < buildings[rightIndex]) {
				leftIndex++;
			}
			else {
				rightIndex--;
			}
		}
		System.out.println(answer[0] +" " + answer[1]);
		return 0;
	}
}
