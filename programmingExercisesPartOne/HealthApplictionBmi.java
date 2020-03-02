package programmingExercisesPartOne;

import java.util.Scanner;

public class HealthApplictionBmi {

	public static void main(String[] args) {
		// Create Scanner 
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter weight in pounds
		System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        //Prompt user to enter height 
        System.out.println("Enter feet:");
        double feet = input.nextDouble();
        System.out.println("Enter inches: ");
        double inches = input.nextDouble();
        
        double height = feet*12*inches;
        
        //Compute BMI
        double bmi= weight*0.45359237/
        		((height*0.0254)*(height*0.0254));
        
        //Display result 
        System.out.println("BMI is " + bmi);
        if(bmi<18.5)
        	System.out.println("Underweight");
        else if(bmi<25)
        	System.out.println("Normal");
        else if(bmi<30)
        	System.out.println("Overweight");
        else 
			System.out.println("Obese");
		
	}

}
