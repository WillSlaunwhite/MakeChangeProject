package labs;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		returnDiff(customerTotal(), tenderedAmount());
	}
	//adding comment to test the commits, having issues


	public static double customerTotal() {
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
	
	public static double returnDiff(double x, double y) {
		double difference=0;
		if(x-y==0) {
			System.out.println("Exact Change");
		}
		else if(x-y>0) {
			difference = (x-y);
		} else {
			System.out.println("Not a valid amount, customer still owes.");
		} return difference;
	}
	
	public static void calculateChange(double x) {
		int penny, nickel, dime, quarter, dollar, fiveDol, tenDol, twentyDol;
		if(x<1) {
			//calculate change
		} 
		else if(x>1) {
			//calculate dollars
		}
	}
	
	
}
