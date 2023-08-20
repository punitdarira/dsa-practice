package recursive;
/*
 * 
 */
class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(1297));

	}
	
	private static int sumOfDigits(int input) {
		if(input < 10) return input;
		return input % 10 +sumOfDigits(input/10);
	}

}
