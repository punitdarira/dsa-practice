package recursive;

import java.util.Arrays;
import java.util.List;

/*
 * 
 */
class RopeCuttingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int n = 24; int a = 13; int b = 9; int c = 11;
		 */
		int n = 5;
		int a = 2;
		int b = 5;
		int c = 1;
		System.out.println(rope(n, 0, a, b, c));

	}
	
	private static int rope(int n, int numTracker, int ... fragment) {
		if(n == 0) {
			return numTracker;
		}
		Arrays.sort(fragment);
		if(n < 1){
			return -1;
		}
		return getGreaterOfThreeNos(
				rope(n-fragment[0], numTracker+1, fragment),
				rope(n-fragment[1],  numTracker+1, fragment),
				rope(n-fragment[2],  numTracker+1, fragment)
				);
		
	}
	private static int getGreaterOfThreeNos(int ...nos) {
		Arrays.sort(nos);
		return nos[2];
		
	}

}
