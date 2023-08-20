package recursive;
/*
 * 
 */
class SumOfNNaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNnaturalNo(3));
	}
	
	private static int sumOfNnaturalNo(int n) {
		if(n<=0) return 0;
		return n + sumOfNnaturalNo(n-1);
	}

}
