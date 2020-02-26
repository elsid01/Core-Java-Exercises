package programmingexercises;

import java.util.Scanner;

public class Acceleration {

	public static void main(String[] args) {
		// Create a Scanner 
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for starting velocity , ending velocity, and the time span 
        System.out.print("Enter v0, v1, and t: ");
        
        double initVelocity = input.nextDouble();
        double endVelocity = input.nextDouble();
        double timeSpan = input.nextDouble();
        
        //Compute the acceleration 
        double a = ( endVelocity - initVelocity)/timeSpan;
        
        //Display result 
        System.out.println("The average acceleration is " + a);
	}

}
