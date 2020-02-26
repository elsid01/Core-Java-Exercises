package Programmingexercisespart2;

import java.util.Scanner;

public class ComputingBMI {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();
		
		double weigthInKilograms = weightInPounds*0.45359237;
		
		//Prompt the user for height in inches
		System.out.print("Enter height in inches: ");
		
		double heightInInches = input.nextDouble();
		
		double heightInMetters = heightInInches*0.0254;
		
		//Compute BMI
		
		double BMI = weigthInKilograms/(heightInMetters*heightInMetters);
		
		//Display result
		System.out.println("BMI IS " + BMI);

	}

}
