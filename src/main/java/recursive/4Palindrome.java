package recursive;
/*
 * 
 */
class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abba"));
	}
	
	private static boolean isPalindrome(String input) {
		if(input.length() <= 1) return true;
		return input.substring(0, 1).equals(input.substring(input.length()-1, input.length())) &&
				isPalindrome(input.substring(1, input.length()-1));
	}

}
