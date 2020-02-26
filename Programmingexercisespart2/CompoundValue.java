package Programmingexercisespart2;

import java.util.Scanner;

public class CompoundValue {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for monthly saving 
		
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();
		
		//Computer for the account value 
		double interrestRate = 0.05/12;
		
		double accountValue = savingAmount*(1+interrestRate);
		
		//Display Result
		System.out.println("After the six month, the account value is : " + accountValue);

	}

}
