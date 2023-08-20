package recursive;
/*
 * TailRecusive is when the last call in the function is a recursive call. Modern compilers work better with
 * tail recursive functions. 
 * 
 * Merge sort doesn't use train recursive so it is slower. Quick sort does and it is faster.
 */
class TailRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonTailRecursiveFun(5);
	}
	
	public static void nonTailRecursiveFun(int n) {
		if (n == 0 ) return;
		nonTailRecursiveFun(n-1);
		System.out.println(n);
	}
	
	//Converting it to tailRecursive
	public static void tailRecursiveFun(int n) {
		if (n == 0 ) return;
		nonTailRecursiveFun(n-1);
		System.out.println(n);
	}

}
