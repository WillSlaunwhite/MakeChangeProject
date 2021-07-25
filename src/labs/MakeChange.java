package labs;

import java.text.DecimalFormat;
import java.util.Scanner;

		// main here calls three methods, returnDiff, which is the core of the class, customerTotal, which 
		// creates a scanner and prompts the user for the total and returns that as a double, and tenderedAmount,
		// which does the same for the amount paid. These doubles are passed to returnDiff, which finds the difference
		// of the two numbers, then loops through the different denominations while the difference is greater than 0. 
		// else if statements check to see if we can return the current denomination. If the can return the denomination, 
		// the call calculateAmount, which is a method that accepts two doubles, an amount and a denomination, and returns
		// an updated total.

public class MakeChange {
	public static void main(String[] args) {
		returnDiff(customerTotal(), tenderedAmount());
	}


		// so, here's what happened. My code was working for the most part but was having some issues 
		// handling decimal points. And I couldn't really find a way that I could think of to easily
		// reformat the number, and I couldn't find a solution without rewriting all my code, so I 
		// looked into the issue and found I could either use BigDecimal or DecimalFormat, and DecimalFormat
		// seemed easier so I used that to round my variables.  
		// If you don't want me to use that method, let me know and I'll come up with a different solution. 
		

		
		// As stated above, I create a double equaling the difference between what the amount paid was and what 
		// the actual total was. I then round it to two decimal points. 

	public static void returnDiff(double custTotal, double amountPaid) {
		double difference = amountPaid-custTotal;
		DecimalFormat df = new DecimalFormat("#.##");
		difference = Double.valueOf(df.format(difference));
		
		if(difference==0) {
			System.out.println("Exact change.");
		}
		while(difference>0) {
			
			if(difference-20>0) {
				System.out.print("Twenties: "+((int)difference/20));
				difference = calculateAmount(difference, 20);
				continue;
				
			}
			
			else if(difference-10>0) {
				System.out.print(" Tens: "+((int)difference/10));
				difference = calculateAmount(difference, 10);
				continue;
			}
			
			else if(difference-5>0) {
				System.out.print(" Fives: "+((int)difference/5));
				difference = calculateAmount(difference, 5);
				continue;
			}
			
			else if(difference-1>0) {
				System.out.print(" Ones: "+((int)difference/1));
				difference = calculateAmount(difference, 1);
				difference = Double.valueOf(df.format(difference));
				continue;
			}
			
			else if(difference-.25>0) {
				System.out.print(" Quarters: "+(int)(difference/.25));
				difference = calculateAmount(difference, .25);
				difference = Double.valueOf(df.format(difference));
				continue;
			}
			
			else if(difference-.1>0) {
				System.out.print(" Dimes: "+(int)(difference/.1));
				difference = calculateAmount(difference, .1);
				difference = Double.valueOf(df.format(difference));
				continue;
			}
			
			else if(difference-.05>0) {
				System.out.print(" Nickels: "+(int)(difference/.05));
				difference = calculateAmount(difference, .05);
				difference = Double.valueOf(df.format(difference));
				continue;
			}
			
			else if(difference-.01>=0) {
				System.out.print(" Pennies: "+(int)(difference/.01));
				difference = calculateAmount(difference, .01);
				continue;
				
			}
			break;
		}	
		
		
		if(difference<0) {
			System.out.println("Invalid input, please try again...");
		}
	}
	
	
		// works by taking in the total and denomination, counting how many we could return,
		// and the adjusting the total by that amount of that denomination. using method 
		// overload we can cover both dollar denominations and cent denominations. 
	
	public static double calculateAmount(double custTotal, int denomination) {

		int counter;
		counter= (int)(custTotal/denomination);
		
		custTotal -= (counter*denomination);
		return(custTotal);
	}
	
	public static double calculateAmount(double custTotal, double denomination) {

		int counter;
		counter= (int)(custTotal/denomination);
		
		custTotal -= (counter*denomination);
		return(custTotal);
	}
	
		// this method takes input asking what the total was
	
		// additionally, i have my scanner close statements commented out because I get some strange
		// errors when I put them in. Why is this? I think i'm missing something simple here.
	
	public static double customerTotal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What was the total?");
		double total = sc.nextDouble();
		//sc.close();
		return total;
	}
	
	
		// this method takes input asking how much customer paid
	public static double tenderedAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much did the customer pay?");
		double total = sc.nextDouble();
		//sc.close();
		return total;
	}
	
}