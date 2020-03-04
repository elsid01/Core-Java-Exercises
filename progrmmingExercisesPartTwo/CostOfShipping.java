package progrmmingExercisesPartTwo;

import java.util.Scanner;

public class CostOfShipping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the weight
		
        System.out.println("Enter package weight: ");
        double weight = input.nextDouble();
        
        if(weight<=1) {
        	System.out.println("The shipping cost is $3.5");
        }
        else if(weight<=3) {
        	System.out.println("The shipping cost is $5.5");
        }
        else if(weight<=10) {
        	System.out.println("The shipping cost is $8.5");
        }
        else if(weight<=20) {
        	System.out.println("The shipping cost is $10.5");
        }
        else {
        	System.out.println("The package cannot be shipped");
        }
	}

}
