package pkg.add;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum : " + sum);
	}

}
