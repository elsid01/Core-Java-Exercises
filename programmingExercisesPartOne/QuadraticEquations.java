package programmingExercisesPartOne;

import java.util.Scanner;

public class QuadraticEquations {

	public static void main(String[] args) {
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user for a b and c
		
		System.out.print("Enter  a, b, c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//Compute the roots
		
		double r1= (-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
		double r2= (-b - Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
		double disciminant = Math.pow(b, 2)-4*a*c;
		//Obtain the roots
		if(disciminant>0) {
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		}
		else if(disciminant==0) {
			System.out.println("The equation has one root " + r1);
		}
		else {
			System.out.println("The equation has no real roots");
		}

	}

}
