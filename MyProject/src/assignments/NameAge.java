package assignments;

import java.util.Scanner;

public class NameAge {
	static String a;
	static int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setNameAge();
		getNameAge(a, b);
	}
	
	static void setNameAge() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.next();
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		a = name;
		b = age;
	}
	
	static void getNameAge(String name, int age) {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}


