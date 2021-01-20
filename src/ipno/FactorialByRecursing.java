package ipno;

public class FactorialByRecursing {
	public static void main(String[] args) {
		System.out.println("limit of long is " + Long.MAX_VALUE);
		long n = 40;
		long result = factorial(n);
		System.out.print("result is " + result);
	}
	
	public static long factorial(long n) {
		if(n == 0) {
			return 1;
		} else {
			return(n* factorial(n-1));
		}
	}
}


/**
 * n = n * fac(n-1)
*/
