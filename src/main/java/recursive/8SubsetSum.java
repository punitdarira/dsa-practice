package recursive;

import java.util.Arrays;
import java.util.List;

/*
 * 
 */
class SubsetSum {

	public static void main(String[] args) {
		//System.out.println(getSubsetsWithSum(8, 0, 2, 3, 5, 6, 10));
		System.out.println(getSubsetsWithSum(8, 0, 1, 2, 3, 4, 5));
		//System.out.println(getSubsetsWithSum(8, 0, 10, 20, 15));

	}
	
	private static int getSubsetsWithSum(int sum, int index, int ...elements) {
		if(sum == 0) {
			return 1;
		}
		if(sum < 0) {
			return 0;
		}
		int returnNoOfSubsets = 0;
		for(int i = index; i<elements.length; i++) {
			returnNoOfSubsets += getSubsetsWithSum(sum-elements[i], i+1, elements);
			
		}
		return returnNoOfSubsets;
	}

}
