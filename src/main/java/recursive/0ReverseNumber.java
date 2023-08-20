package recursive;

class ReverseNumber {

	public static void printNtoOne(int n) {
		if(n == 0) return;
		System.out.println(n);
		printNtoOne(n-1);
	}
	public static void main(String[] args) {
		printNtoOne(5);

	}

}
