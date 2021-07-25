package labs;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		returnDiff(customerTotal(), tenderedAmount());
//		calculateChange(x);
	}


	public static void returnDiff(double custTotal, double amountPaid) {
		double difference = amountPaid - custTotal;
		while(difference>0) {
			System.out.println("Difference 1: "+difference);
//			System.out.println("Difference 1: "+difference);
//			System.out.println("Difference 1: "+difference);
//			System.out.println("Difference 1: "+difference);
			
			if(difference-20>0) {
				System.out.println("Twenties: "+((int)difference/20));
				difference = calculateDollars(difference, 20);
				System.out.println("Difference 2: "+difference);
			}
			if(difference-10>0) {
				System.out.println("Tens: "+((int)difference/10));
				difference = calculateDollars(difference, 10);
				System.out.println("Difference 3: "+difference);
			}
			if(difference-5>0) {
				System.out.println("Fives: "+((int)difference/5));
				difference = calculateDollars(difference, 5);
				System.out.println("Difference 4: "+difference);
			}
			if(difference-1>0) {
				System.out.println("Ones: "+((int)difference/1));
				difference = calculateDollars(difference, 1);
				System.out.println("Difference 5: "+difference);
			}
			if(difference-.25>0) {
				System.out.println("Quarters: "+((int)difference/.25));
				difference -= calculateCents(difference, .25);
			}
			if(difference-.1>0) {
				System.out.println("Dimes: "+((int)difference/.1));
				difference -= calculateCents(difference, .1);
			}
			if(difference-.05>0) {
				System.out.println("Nickels: "+((int)difference/.05));
				difference -= calculateCents(difference, .05);
			}
			if(difference-.01>0) {
				System.out.println("Pennies: "+((int)difference/.01));
				difference -= calculateCents(difference, .01);
			}
			break;
			
			
			
			
			
			
			
			
			
			
		}
	}
			

	public static double calculateDollars(double custTotal, int denomination) {
		//calculate change
		//Currently, this function works by passing in the amount FINISH THIS COMMENT

		int counter;
		counter= (int)(custTotal/denomination);
		
//		System.out.print(denomination+": "+counter+" ");
		custTotal -= (counter*denomination);
		return(custTotal);
	}
	
	

	public static double calculateCents(double custTotal, double denomination) {
		int counter;
		counter = (int) (custTotal / denomination);
		
//		System.out.print(denomination + ": " + counter + " ");
		custTotal -= (counter * denomination);

		return (custTotal);
	}
	
	
	
//		this method takes input asking what the total was
	public static double customerTotal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What was the total?");
		double total = sc.nextDouble();
//		sc.close();
		return total;
	}
	
	
// 		this method takes input asking how much cust paid
	public static double tenderedAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much did the customer pay?");
		double total = sc.nextDouble();
//		sc.close();
		return total;
	}
	
}



//if(custTotal>1) {
//counter= (int)(custTotal/denomination);
//System.out.print(denomination+": "+counter+" ");
//custTotal -= (counter*denomination);
//dolIndex+=1;
//calculateDollars(custTotal, diffDenomsDollars[dolIndex]);
//} 
//
//else if(custTotal>0 && custTotal<1) {
//counter= (int)(custTotal/denomination);
//System.out.print(denomination+": "+counter+" ");
//custTotal -= (counter*denomination);
//centIndex+=1;
//calculateDollars(custTotal, diffDenomsCents[centIndex]);

//from calcDollars
//	else if(custTotal>=1) {
//		return custTotal;
//	} else {
//		counter = (int)(custTotal/changeDenom);
//		System.out.println(changeDenom+": "+counter+" ");
//		custTotal-= (counter*changeDenom);
//	}

