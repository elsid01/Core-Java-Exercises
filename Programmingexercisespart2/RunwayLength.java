package Programmingexercisespart2;

import java.util.Scanner;

public class RunwayLength {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for speed v and acceleration a
		System.out.print("Enter speed and acceleration: ");
		
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		//compute the length
		
		double minLength = speed*speed/(2*acceleration);
		
		//Display result
		System.out.println("The minimum runway length for this airplan is " +
		minLength + " metters");
		
		

	}

}
