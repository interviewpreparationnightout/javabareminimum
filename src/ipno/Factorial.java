package ipno;

public class Factorial {
	public static void main(String[] args) {
		int n = 3;
		int product = 1;
		for(int i = n; i > 1; i--)
		{
			product = product * i;
		}
		System.out.println(product);
	}
}