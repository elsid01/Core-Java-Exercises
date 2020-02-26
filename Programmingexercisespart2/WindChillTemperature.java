package Programmingexercisespart2;

import java.util.Scanner;

public class WindChillTemperature {

	public static void main(String[] args) {
		// Create Scanner 
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for temperature
		System.out.println("Enter the temperature in Fahrenheit between" +  
		" - 58 degrees Fahrenheit and 41 degrees Farenheit: ");
		
		double ta = input.nextDouble();
		
		//Prompt the user for the wind speed
		System.out.print("Enter the wind Speed (>=2) in miles per hour: ");
		double v = input.nextDouble();
		
		//Compute the wind-chill
		
		double twc= 35.74 + 0.6215*ta - 35.75*(Math.pow(v, 0.16)) + 0.4275*ta*(Math.pow(v, 0.16));
		
		//Display result
		System.out.println("The wind chill index is " + twc);
		

	}

}
