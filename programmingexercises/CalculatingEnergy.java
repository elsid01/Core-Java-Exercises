package programmingexercises;

import java.util.Scanner;

public class CalculatingEnergy {

	public static void main(String[] args) {
		// Create Scanner 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for the amount of water
		System.out.print("Enter the amount of water in kilograms: ");
		double waterAmount = input.nextDouble();
		
		// Prompt the user for the initial temperature
		System.out.print("Enter the initial temperature: ");
		double initTemperature = input.nextDouble();
		
		// Prompt the user for final temperature 
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		//Compute the energy Q 
		double energyQ = waterAmount*(finalTemperature-initTemperature)*4184;
		
		//Display result
		System.out.println("The energy is " + energyQ);
		
		

	}

}
