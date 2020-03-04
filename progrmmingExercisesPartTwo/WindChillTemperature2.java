package progrmmingExercisesPartTwo;

import java.util.Scanner;

public class WindChillTemperature2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Enter the temperature in Fahrenheit
		System.out.println("Enter the temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		if(fahrenheit<-58 || fahrenheit>41) {
			System.out.println("The temperature must be between -50F and 41F");
			System.exit(1);
		}
		
		//Enter the wind speed miles per hour
		System.out.println("Enter the wind speed in miles per hour");
        double speed = input.nextDouble();
        
        if(speed<2) {
        	System.out.println("The speed must be greater than or equal to 2");
        	System.exit(2);
        }
        
        //Compute wind chill index
        double windChillIndex = 35.74 + 0.6215 * fahrenheit -35.75*
        		Math.pow(speed, 0.16) + 0.4275 * fahrenheit *
        		Math.pow(speed, 0.16);
        
        
        //Display the result
        System.out.println("The wind chill index is " + windChillIndex);
        
        
        
        
	}

}
