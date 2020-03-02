package programmingExercisesPartOne;

import java.util.Scanner;

public class CramersRule {

	public static void main(String[] args) {
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for the coefficients 
		System.out.println("Enter a, b, c, d, e, f: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		//Obtain the denominator
		double denominator = a*d-b*c;
		
		//Compute x and y;
		double x = (e*d-b*f)/denominator;
		
		double y = (a*f-e*c)/denominator;
		
		//Display result
		if(denominator==0) {
			System.out.println("The equation has no solution");
		}else {
			System.out.println("x is " + x + "and y is " + y);
		}

	}

}
