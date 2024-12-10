package assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findFactorial();
	}
	
	static void findFactorial() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find the factorial : ");
		int num = sc.nextInt();
		int factorial = 1;
		for(int i=1; i<=num; i++) {
			factorial = factorial * i;
		}
		System.out.println("The factorial of " + num + " is " + factorial);
	}

}


