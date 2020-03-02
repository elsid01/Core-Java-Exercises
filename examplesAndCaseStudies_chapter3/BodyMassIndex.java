package examplesAndCaseStudies_chapter3;

import java.util.Scanner;



public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the weight in pounds
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		//Prompt the user to enter height in inches
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();
		
		final double KILOGRAM_PER_POUND = 0.45359237;
		final double METTERS_PER_INCH = 0.0254;
	    // Compute BMI
		double weightInKilograms = weight*KILOGRAM_PER_POUND;
		double heightInMetters = height*METTERS_PER_INCH;
		double bmi = weightInKilograms/(heightInMetters*heightInMetters);
		
		//Display result 
		System.out.println("BMI is " + bmi);
		
		if(bmi<18.5)
			System.out.println("Underweighted");
		else if (bmi<25)
			System.out.println("Normal");
		else if(bmi<30)
			System.out.println("Overweighted");
		else 
			System.out.println("Obese");

	}

}
