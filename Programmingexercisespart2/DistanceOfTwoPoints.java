package Programmingexercisespart2;

import java.util.Scanner;

public class DistanceOfTwoPoints {

	public static void main(String[] args) {
		// Create a scanner 
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the coordinates
		System.out.print("Enter x1 and y1:");
		double x1  = input.nextDouble();
		double y1  = input.nextDouble();
		
		System.out.print("Enter x2 and y2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		//Compute the distance
		
		double distance = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));

		//Display result
		System.out.println("The distance between the two points is " + distance);
	}

}
