package mathemetics;

public class Palindrome {
	public static int calculatePalindrome(int result, int i) {
		if(i == 1) {
			return result;
		}
		result = result * --i;
		return calculatePalindrome(result, i);
	}
	
	public static int betterSolutionPalindrome(int i) {
		if(i == 0) {
			return 1;
		}
		return i * betterSolutionPalindrome(i-1);
	}
	
	public static void main(String[] args) {
		System.out.println(calculatePalindrome(6, 6));
		System.out.println(betterSolutionPalindrome(6));

	}

}
