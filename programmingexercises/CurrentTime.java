package programmingexercises;

import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for time zone offset
		System.out.print("Enter the time zone offset to GMT:");
		int offset = input.nextInt();
		
		//Obtain the total millisecond since jan 1, 1979
		long totalMilliseconds = System.currentTimeMillis();
		
		//Obtain the total seconds since 
		long totalseconds = totalMilliseconds/1000;
		
		//Compute the current second
		long currentSeconds = totalseconds%60;
		
		//Obtain total minutes since
		long totalMinutes = totalseconds/60;
		
		//Compute current minutes 
		long currentMinutes = totalMinutes%60;
		
		//Obtain total hours since 
		long totalHours = totalMinutes/60;
		
		//Compute the current hours
		long currentHours = (totalHours + offset)%24;
		
		//Display result
		System.out.println("The current time is: " + currentHours+
				" : " + currentMinutes + " : " + currentSeconds);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
