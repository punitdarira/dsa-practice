package neetcode.two_pointer;

public class Palindrome {

	public static void main(String[] args) {
		isPalindrome("race car");
	}

	private static void isPalindrome(String inputStr) {
		inputStr = inputStr.replace(" ", "");
		int leftIndex = 0, rightIndex = inputStr.length() - 1;
		boolean isPalindrome = true;
		while (leftIndex < rightIndex) {
			if (inputStr.charAt(leftIndex) != inputStr.charAt(rightIndex)) {
				isPalindrome = false;
				break;
			}
			leftIndex ++; rightIndex--;
		}
		System.out.println("Palindrome- "+ isPalindrome);
		
	}

}
