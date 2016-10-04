import java.util.Scanner;

/**
 * @author Siying Zhang
 * Find how many 5 in all factors.
**/
public class TrailingZeros {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a number to do factorial: ");

		int number = scan.nextInt();
		long factorial = 1;

		for(int i = 2; i<=number; i++) {
			factorial *= i;
		}
		System.out.println("The factorial of " + number + " is " + factorial);
		System.out.println("The number of trailing zeros: " + numberOfTrailingZero(number));

	}

	public static int numberOfTrailingZero(int n) {
		int numOfZeros = 0;

		if(n<5) return numOfZeros;

		numOfZeros = n/5;
		return numOfZeros;

	}
}