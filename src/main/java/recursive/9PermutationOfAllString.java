package recursive;

/*
 * 
 */
class PermutationOfAllString {

	public static void main(String[] args) {
		
		permutationOfAllString("", "abcde");

	}
	
	private static void permutationOfAllString(String prefix, String str) {
		if(str.length() ==1 ) {
			System.out.println(prefix + str);
		}
		for(int i = 0; i<str.length(); i ++) {
			char pre = str.charAt(i);
			String nextStr = str.substring(0, i)+str.substring(i+1, str.length());
			permutationOfAllString(prefix + String.valueOf(pre), nextStr);
		}
	}

}
