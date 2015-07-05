package School;

public class Recursion {
	
	/*
	 * Finds the nth factorial
	 * for(int i = 0; i <= 20; i++) {
			System.out.println(factorial(i));
		}
	 */
	static int factorial(int n) {
		if(n == 0)
			return 1;
		return (n * factorial(n-1));
	}
	
	
	/* 
	 * Finds the nth fibonnaci number
	 * for(int i = 0; i <= 20; i++) {
			System.out.println(fibonnaci(i));
		}
	 */
	static int fibonnaci(int n) {
		if(n < 3) 
			return 1;
		return (fibonnaci(n-1) + fibonnaci(n-2));
	}
	
	static int HCF(int x, int y) {
		int max = 0;
		if(y % x == 0)
			return x;
		if(x % y == 0)
			return y;
		for(int i = 1; i <= x; i++) {
			if(x % i == 0) {
				for(int j = 1; j <= y; j++) {
					if(y % j == 0) {
						if(i == j) {
							if(i > max) {
								max = i;
								System.out.println(max);
							}
						}
					}
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
	}
}
