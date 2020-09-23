package basics;

public class FactorialAssignment {

	public static void main(String[] args) {
		// 0! = 1
		// 1! = 1
		// 2! = 2 * 1! = 2 * 1 = 2
		// 3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1 = 6
		// 4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1 = 24
		// n! = n*(n-1)!
		
		System.out.println(exp(4));

	}
	public static int exp(int n) {
		if (n == 0) {
			return 1;
		}
		else if(n == 1) {
			return 1;
		}
		return (n * exp(n-1)); 
	}

}
