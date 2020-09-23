package basics;

public class SumAssignment {

	public static void main(String[] args) {
		// Write a function that takes a value n returns the sum of numbers 1 to n
		System.out.println(sum(4));
	}
	
	public static int sum(int n) {
		int sum = 0;
		for (int i=1; i<= n; i++) {
			sum=sum+i;
		}
	return sum;
	}
}
