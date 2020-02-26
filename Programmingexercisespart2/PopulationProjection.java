package Programmingexercisespart2;

import java.util.Scanner;

public class PopulationProjection {

	public static void main(String[] args) {
		// Create a scanner 
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the number of years
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		//Obtain the number of born, death , and immigrants per year
		
		final double yearlySecondNumber =365*24*60*60;
		double currentPopulation = 312032486;
		double bornNumber = yearlySecondNumber /7.0;
		double deathNumber = yearlySecondNumber/13.0;
		double immigrantNumber= yearlySecondNumber/45.0;
		
		// Computer the the new population number
		
		double newPopulationNumber = (long)( currentPopulation + years*(bornNumber + immigrantNumber -deathNumber));
		
       //Display Result
		
		System.out.println("The population number in " + years + " years is " + newPopulationNumber);
		
		
		
		
		
		
		
	}

}
