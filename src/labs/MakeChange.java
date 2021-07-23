package labs;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		System.out.println("Hello");
	}


	public static double promptUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What was the total?");
		double total = sc.nextDouble();
		return total;
	}

	public static double tenderedAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much did the customer pay?");
		double total = sc.nextDouble();
		return total;
	}
}
