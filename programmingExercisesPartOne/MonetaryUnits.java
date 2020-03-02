package programmingExercisesPartOne;

import java.util.Scanner;

public class MonetaryUnits {

	public static void main(String[] args) {
		//Create scanner 
		Scanner input = new Scanner(System.in);
		
		//Receive the amount entered from the keyboard
		System.out.println("Enter an amount in double, for example 11.56: ");
		
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount*100);
		
		//Find the number of one dollars
		int numberOfOneDollars = remainingAmount/100;
		remainingAmount=remainingAmount%100;
		
		//Find the remaining quarters in the remaining amount
		int numberOfQuarters= remainingAmount/25;
		remainingAmount = remainingAmount%25;
		
		//Find the number dimes in the remaining amount 
		int numberOfDimes = remainingAmount/10;
		remainingAmount= remainingAmount%10;
		
		//Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount/5;
		remainingAmount = remainingAmount%5;
		
		//Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		//Display result
		if(amount<0) {
			System.out.println("Your amount is negative");
			System.exit(1);
		}
		else if(amount<0) {
			System.out.println("Your amount is zero");
			System.exit(2);
		}
		
		System.out.println("Your amount " + amount + " consist of ");
		
		if(numberOfOneDollars>1)
			System.out.println(numberOfOneDollars + "\t dollars");
		else if (numberOfOneDollars==1)
			System.out.println(numberOfOneDollars + "\t dallar");
		
		if(numberOfQuarters>1)
			System.out.println(numberOfQuarters + "\t quarters");
		else if (numberOfOneDollars==1)
			System.out.println(numberOfQuarters + "\t quarter");
		
		if(numberOfDimes>1)
			System.out.println(numberOfDimes + "\t dimes");
		else if (numberOfOneDollars==1)
			System.out.println(numberOfDimes + "\t dime");
		
		if(numberOfOneDollars>1)
			System.out.println(numberOfNickels + "\t nickels");
		else if (numberOfOneDollars==1)
			System.out.println(numberOfNickels + "\t nickel");
		
		if(numberOfPennies>1)
			System.out.println(numberOfPennies + "\t pennies");
		else if (numberOfOneDollars==1)
			System.out.println(numberOfPennies+ "\t penny");
	}

}











